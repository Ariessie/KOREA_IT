package ex2_single_for;

import java.util.Scanner;

public class Ex2_for {

	public static void main(String[] args) {
		//Ű���忡�� ������ �Է¹޾� �Է¹��� ���ڿ� �ش�Ǵ� �������� �������!!
		//�� : 10
//		2~9������ ���� �Է��ϼ���

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� :");
		int num = sc.nextInt();
		
		if ( num >= 2 && num <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			} //for	
		} else {
		System.out.println("2~9 ������ ���� �Է��Ͻÿ�");
			
		} //if
		
		
		
		
		
		
		
		
		
		
	}//main

}
