package ex2_single_for;

import java.util.Scanner;

public class Ex2_for {

	public static void main(String[] args) {
		//키보드에서 정수를 입력받아 입력받은 숫자에 해당되는 구구단을 출력하자!!
		//단 : 10
//		2~9사이의 값만 입력하세요

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 :");
		int num = sc.nextInt();
		
		if ( num >= 2 && num <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			} //for	
		} else {
		System.out.println("2~9 사이의 값만 입력하시오");
			
		} //if
		
		
		
		
		
		
		
		
		
		
	}//main

}
