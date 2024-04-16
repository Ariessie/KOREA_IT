package ex4_continue;

public class Ex1_continue {
	
	//continue문
	//for문 안에서 동작하는 continue문은 기본적으로 가장 가까운 for문의 증감식으로 간다.

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 2; i++) {
			
			
			for (int j = 1; j <= 4; ) {
				
				if (j %2 ==0 ) {
					continue;
					//continue문 바로 아래에는 어떤 코드도 동작하지 않는다.
				}//if
				System.out.print(j + " ");
				j++;
				
			} // inner
			
			System.out.println();
		} // outer

	}// main

}
