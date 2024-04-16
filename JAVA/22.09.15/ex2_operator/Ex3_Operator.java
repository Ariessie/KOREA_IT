package ex2_operator;

public class Ex3_Operator {

	public static void main(String[] args) {
		
		// 논리연산자
		
		int age = 20;
		int limit = 25;
		
		boolean res	= limit - age >= 5 && age > 20;
		System.out.println("res: "+res);		
		
		
		res	= limit - age >= 5 && (age+= 2) > 20;
		System.out.println("age: "+age);
		
		//&&연산은 앞쪽 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
		res	= limit - age > 5 && (age -= 2) > 20;
		System.out.println("age: "+age);
		
		System.out.println("-----------");
		
		
		int n1 = 10;
		int n2 = 20;
		res = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println(res);
		
		System.out.println("not 연산자: "+!res+res );
		System.out.println(res);
		
		
		
	}

}
