package ex2_single_for;

import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
		/* 
			Ű���忡�� ������ �Է¹޴´�
			1���� �Է¹��� �������� ���� ����Ͽ� ���
			���� ��� 5�� �Է� �޾Ҵٸ�, 1+2+3+4+5 = 15 �� ����ؾ� �Ѵ�.
			
			
			
			
		*/
		
		Scanner sc = new Scanner(System.in);
		int result = 0; //������� ����� ����
		
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <=num ;i++ ) {		
			result += i;
		}
		
		System.out.println("���: "+result);
		
		
		
		
		
		
	}

}
