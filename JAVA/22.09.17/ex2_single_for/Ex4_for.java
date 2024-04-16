package ex2_single_for;

import java.util.Scanner;

public class Ex4_for {

	public static void main(String[] args) {
		/* 
		키보드에서 n1, n2에 정수값을 입력 받는다
		n1~n2까지의 합을 출력
		(ex. 2,5, -> 2+3+4+5=14)
		      수1 : 2
		     수2 : 5
		   결과 : 14
		   
		   
		
		
		*/
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.print("수1: ");
		int n1 = sc.nextInt();
		System.out.print("수2: ");
		int n2 = sc.nextInt();
		
		//스왑 (두 변수의 값을 바꾸는 코드)
		if(n1> n2) {
			int n3 = n1;
			n1 = n2;
			n2= n3;
		} //if
		
			for (int i = n1 ; i <= n2 ;i++  ) {
			
			result += i;
		
		}//for
		System.out.println("결과: "+result);
		
		
	}//main

}
