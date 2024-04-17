package ex4_try_catch;

import java.util.Scanner;

public class Ex3_try_catch {

	public static void main(String[] args) {
		// 정수 : 1a0
		// 정수만 입력하세요
		
		
	Scanner sc = new Scanner(System.in);
	System.out.print("정수: ");
	
		try {			
			int num = sc.nextInt();
			System.out.println("결과: "+num);
		} catch (Exception e) {
			System.out.println("정수만 입력하세요");
					
		}
		
		
		
		
		
		
		

	}

}
