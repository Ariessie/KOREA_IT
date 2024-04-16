package ex2_calculator;

public class Cal {

	
	public void getResult(int n1, int n2, String s) {
		//main에서 입력받은 수와 연산자를 통한 연산결과 출력
		switch (s) {
		case "+":
			System.out.printf("%d + %d = %d",n1,n2, n1+n2);
			break;
		case "*":
			System.out.printf("%d * %d = %d",n1,n2, n1*n2);
			break;
		case "/":
			System.out.printf("%d / %d = %d",n1,n2, n1/n2);
			break;
		case "-":
			System.out.printf("%d - %d = %d",n1,n2, n1-n2);
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		
	}
}
