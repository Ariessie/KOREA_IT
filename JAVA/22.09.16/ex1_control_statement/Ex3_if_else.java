package ex1_control_statement;

public class Ex3_if_else {

	public static void main(String[] args) {
		// if-els

		/*
		 * ���� age�� ���̸� �����ϰ�
		 * 30�� �̻��̸�, '��Ǹ�ŭ ��̱���'��
		 * �׷��� ������ '���ݴ� ��ŵ� ��'�� ����ϴ� �ڵ带 �ۼ�
		 * 
		 * 
		 */
		
		int age = 21;
		if(age >= 30) {
			System.out.println("��Ǹ�ŭ ��̱���");
		}else {
			System.out.println("���� �� ��ŵ� ��");
		}
		
		//�� �ڵ带 ���׿����ڷ� ��ȯ�Ͻÿ�.
		System.out.println("-----------");
	   
		age = 30;
		String str = age >= 30 ? "��Ǹ�ŭ ��̱���" : "���� �� ��ŵ� ��";
		System.out.println(str);
		
				
	}

}
