package ex2_calculator;

public class Cal {

	
	public void getResult(int n1, int n2, String s) {
		//main���� �Է¹��� ���� �����ڸ� ���� ������ ���
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		
		
	}
}
