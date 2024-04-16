package ex1_control_statement;

import java.util.Scanner;

public class Ex8_switch {

	public static void main(String[] args) {
		/*
		 * 
		 * 7월은 31일 까지 있습니다.
		 * 
		 * 
		 * 
		 * 
		 */

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("당신은 몇월생? " );
		int month = sc.nextInt();
		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 29일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+ "월은 30일가지 있습니다.");
			break;
		default:
			System.out.println(month+ "월은 존재하지 않습니다.");
			break;

		}// switch

	}

}
