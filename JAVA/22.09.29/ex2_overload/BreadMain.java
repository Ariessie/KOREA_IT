package ex2_overload;

public class BreadMain {

	public static void main(String[] args) {


		
		
		
		Bread bread = new Bread();
	
		//���� ��������ϴ�.
		bread.makeBread();
		System.out.println("----------");
		
		
		//���� ��������ϴ�.
		//���� ��������ϴ�.
		//��û�Ͻ� ���� 2�� �������
		bread.makeBread(2);
		System.out.println("----------");
		
		//ũ������ ��������ϴ�.
		//��û�Ͻ� ũ������ 2�� �������
		bread.makeBread("ũ����",2);
		System.out.println("----------");
		
		
		
		
		
		
		

	}

}
