package ex1_casting;

public class Ex2_demotion {

	public static void main(String[] args) {
		
		
		char c = 'A'; //2byte
		int n = c+1; //여기까지 프로모션
		
		c = (char)n;
		
		System.out.println("c: "+c);
		
		
		float f = 5.5f; //4......byte
		int num = 0; //4byte
		num = (int)f;
		
		System.out.println("num: "+num);
		
		
		
		
		
		
		
		
	}

}
