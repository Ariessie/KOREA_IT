package ex3_method;

public class MethodTest {

	
	public char select (String s) {
		
		switch (s) {
		case "1":
			return 'A';

		case "2":
			return 'B';
			
		default:
			return 'C';
		}
		
		
		
		
	}
	
	
	
	public int value2(int n1) {
		n1+= 200;
		System.out.println("n1: "+n1);
		return n1;
	}
	
	
	
	
	
	public String value(int n) {
		n += 100;
		System.out.println("n: "+n);
		//��ȯ���� void�� �ƴѰ��
		//��ȯ�� Ÿ�Կ� �´� �����Ͱ� �ּ��� �ѹ��� return�Ǿ�� �Ѵ�.
		return "���� ����";
		
		
	}
	
	
	public void test1( ) {
		System.out.println("test1 �޼��� ȣ���!");
		System.out.println("----------");
	}
	
	
			
}