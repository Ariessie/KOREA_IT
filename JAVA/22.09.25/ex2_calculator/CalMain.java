package ex2_calculator;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//수1 : 
		//수2 :
		//연산자:
		//결과: 
		
		//main 클래스에서는 수1, 수2, 연산자를 입력받은 작업 후 결과 출력은 cal에서 한다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int nu1 = sc.nextInt();
		System.out.print("수2: ");
		int nu2 = sc.nextInt();
		System.out.print("연산자: ");
		String san = sc.next();

		Cal c = new Cal();
		c.getResult(nu1,nu2,san);
		
		
		
	}

}
