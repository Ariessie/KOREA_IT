package ex2_operator;

public class Ex3_Operator {

	public static void main(String[] args) {
		
		// ��������
		
		int age = 20;
		int limit = 25;
		
		boolean res	= limit - age >= 5 && age > 20;
		System.out.println("res: "+res);		
		
		
		res	= limit - age >= 5 && (age+= 2) > 20;
		System.out.println("age: "+age);
		
		//&&������ ���� ������ �����̸� ���� ������ �������� �ʴ´�.
		res	= limit - age > 5 && (age -= 2) > 20;
		System.out.println("age: "+age);
		
		System.out.println("-----------");
		
		
		int n1 = 10;
		int n2 = 20;
		res = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println(res);
		
		System.out.println("not ������: "+!res+res );
		System.out.println(res);
		
		
		
	}

}
