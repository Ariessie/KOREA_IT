package ex2_single_for;

import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
		/* 
			키보드에서 정수를 입력받는다
			1부터 입력받은 값까지의 합을 계산하여 출력
			예를 들어 5를 입력 받았다면, 1+2+3+4+5 = 15 를 출력해야 한다.
			
			
			
			
		*/
		
		Scanner sc = new Scanner(System.in);
		int result = 0; //결과값을 출력할 변수
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <=num ;i++ ) {		
			result += i;
		}
		
		System.out.println("결과: "+result);
		
		
		
		
		
		
	}

}
