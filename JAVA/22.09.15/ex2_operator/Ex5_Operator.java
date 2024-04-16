package ex2_operator;

public class Ex5_Operator {

	public static void main(String[] args) {
		
		//증감연산자
		
		int a = 10;
		System.out.println("a: "+ ++a);

		int b = 10;
		System.out.println("b: "+ b++);
		System.out.println(b);
		System.out.println("-----");
		--b; //10
		--b; //9
		b++; //9
		b--; //10
		++b; //10
		b++; //11
		--b; //10
		System.out.println(b++);
		System.out.println(b);
		
	}

}
