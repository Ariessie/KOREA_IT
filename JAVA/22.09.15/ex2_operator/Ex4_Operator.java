package ex2_operator;

public class Ex4_Operator {

	public static void main(String[] args) {
		// 비트연산자
		
		//10진수 -> 2진수로 바꿔서 사용해야 한다.
		int a = 10;  //1010 
		int b = 7;   //0111
		int c = a&b; //0010 --> 2
		//둘다 1일 경우에만 1
		//논리곱
		System.out.println("논리곱 : "+c);
		
		
		c = a|b;
		//논리합
		System.out.println("논리합: "+c); //
		
		c=a^b;
		//배타적or
		System.out.println("xor: "+c); //1101
		
		System.out.println("-------------");
		//시프트 연산자
		int n = 12; //1100
		int res = n >> 2;
		System.out.println(res);
		
		char ch = 'F'; //1000110
		char ch_res = (char)(ch >> 1); //0100011
		System.out.println(ch_res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
