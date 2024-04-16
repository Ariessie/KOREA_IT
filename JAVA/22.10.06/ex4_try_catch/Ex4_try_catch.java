package ex4_try_catch;

import java.util.Scanner;

public class Ex4_try_catch {

	public static void main(String[] args) {
		
		//정수 : 100
		//결과 : 100
		
		
		//정수 : aaa
		// aaa은 (는) 정수가 아닙니다.
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		String num = sc.next();
	
		
		
		try {
			
			int n = Integer.parseInt(num);
			System.out.println("결과: "+n);
			
		} catch (Exception e) {
			System.out.println(num+"은(는) 정수가 아닙니다.");
		}
		
		
		
		
		

	}

}
