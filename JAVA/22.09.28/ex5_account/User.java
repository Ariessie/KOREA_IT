package ex5_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);

		outer: while (true) {

			System.out.println("1.��    ��");
			System.out.println("2.��    ��");
			System.out.println("3.��    ��");
			System.out.println("etc.�� ��");
			System.out.print(">> ");

			int select = sc.nextInt();// �޴�����

			switch (select) {
			case 1://�Ա�
				System.out.println("----�Ա�----");
				System.out.print("�Աݾ�: ");
				atm.deposit(sc.nextInt());
				break;
			case 2: //���
				System.out.println("----���----");
				System.out.print("��ݾ�: ");
				atm.withdraw(sc.nextInt());
				break ;

			case 3://�ܾ�
				System.out.println("----�ܾ�----");
				atm.balance();
				break ;

			default://����
				System.out.println("ATM ����� �����մϴ�.");
				break outer;
			}

		}

	}// main
}
