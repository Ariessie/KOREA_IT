package ex2_interface;

public class Kitchen implements Menu1 {
	//�������ձ״� ����ɷ��� ���� ������ ���� ������ ����

	@Override
	public String jjajang() {
		
		return "�߸�+����";
	}
	
	@Override
	public String jjambbong() {
		
		return "ȫ��+����+...";
	}


	@Override
	public String boggembab() {
		return "��õ�� + ¥��ҽ�";
	}


	@Override
	public String tangsuyuck() {
		
		return "������� ���...";
	}
	
	
	

}
