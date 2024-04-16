package ex2_operator;

public class Ex6_Operator {

	public static void main(String[] args) {
		// 삼항 연산자
		int a = 10;
		int b = 15;
		boolean res = ++a >= b ? true : false;
		//true면 앞의 내용
		//false면 뒤의 내용
		System.out.println("++a >= b : "+ res);
		
		int i1 = 5;
		int i2 =10;
		int res2 = (i1 += i1) != i2 ? 100 : 200;
		System.out.println("(i1 += i1) != i2 : "+ res2);
		
		char gender = '여';
		char res3 = gender == '여' ? '합':'불';
		System.out.println(res3);
		
		
		
		
		
		
		
		

	}

}
