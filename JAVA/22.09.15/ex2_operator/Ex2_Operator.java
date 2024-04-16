package ex2_operator;

public class Ex2_Operator {

	public static void main(String[] args) {
	
		//대입 연산자
		
		int n1 = 10;
		int n2 = 7;
		n1 += n2; //n1 = n1 + n2;
		System.out.println("+=: "+n1);
		
		n1 -= 2; //n1 = n1 - 2;
		System.out.println("-=: "+n1);
		
		n1 /= 3; //n1 = n1/3;
		System.out.println("/=: "+n1);
		
		n1 %= 2; //n1 = n1%2;
		System.out.println("%=: "+n1);
		
		
		//비교연산자
		
		int i1 = 10;
		int i2 = 20;
		boolean res = i1 < i2;
		System.out.println("i1 < i2 : "+res);  ///   < : 작다
		res = i1 > i2;
		System.out.println("i1 > i2 : "+res); //     > : 크다
		
		res = i1 <= i2;
		System.out.println("i1 <= i2 : "+res);
		
		res = i1 == i2;
		System.out.println("i1 == i2 : "+res);
		
		res = i1 != i2;
		System.out.println("i1 != i2 : "+res);
		
		
		
	}

}
