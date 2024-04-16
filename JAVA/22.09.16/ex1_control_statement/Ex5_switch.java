package ex1_control_statement;

public class Ex5_switch {

	public static void main(String[] args) {
		// switch-case 문

		int n = 2;

		switch (n) { // 비교값

		case 1: // 조건값
			System.out.println("1. game start");
			break;// switch문을 완전히 빠져 나온다.

		case 2:
			System.out.println("2. information");
			break;

		case 3:
			System.out.println("3.exit");
			break;

		default:
			//비교값과 조건값이 일치하지 않는 겨우 호출되는 영역
			System.out.println("일치하는 것이 없습니다.");
			break;

		}

	}// main

}
