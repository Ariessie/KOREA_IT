package ex4_vending;

import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {

		Vending v = new Vending();
		

		//�ÿ��ڰ� ������ �ݾ����� ���� �� �ִ� ���� �� �����ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("inser coin: ");
		int money = sc.nextInt();
		
		v.showCans(money);
		System.out.print("���ἱ��: ");
		String select = sc.next();
		v.outCan(select);
		
		
		
		
		
		
		
		
		
	}

}
