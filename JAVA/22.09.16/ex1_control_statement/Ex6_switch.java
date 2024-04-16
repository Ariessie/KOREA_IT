package ex1_control_statement;

public class Ex6_switch {

	public static void main(String[] args) {
		// switch

		char ch = 'C';

		switch (ch) {
		case 'A': // 조건값
			System.out.println("90~100");
			break;
		case 'B': // 조건값
			System.out.println("80~89");
			break;
		case 'C': // 조건값
			System.out.println("70~79");
			break;
		case 'D': // 조건값
			System.out.println("60~69");
			break;
		case 'F': // 조건값
			System.out.println("59점 이하");
			break;

		default:
			System.out.println("성적이 올바르게 입력되지 않았습니다.");
			break;

		}

	}

}
