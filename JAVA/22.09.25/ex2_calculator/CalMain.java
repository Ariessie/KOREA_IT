package ex2_calculator;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��1 : 
		//��2 :
		//������:
		//���: 
		
		//main Ŭ���������� ��1, ��2, �����ڸ� �Է¹��� �۾� �� ��� ����� cal���� �Ѵ�.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��1: ");
		int nu1 = sc.nextInt();
		System.out.print("��2: ");
		int nu2 = sc.nextInt();
		System.out.print("������: ");
		String san = sc.next();

		Cal c = new Cal();
		c.getResult(nu1,nu2,san);
		
		
		
	}

}
