package ex5_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);

		outer: while (true) {

			System.out.println("1.입    금");
			System.out.println("2.출    금");
			System.out.println("3.잔    액");
			System.out.println("etc.종 료");
			System.out.print(">> ");

			int select = sc.nextInt();// 메뉴선택

			switch (select) {
			case 1://입금
				System.out.println("----입금----");
				System.out.print("입금액: ");
				atm.deposit(sc.nextInt());
				break;
			case 2: //출금
				System.out.println("----출금----");
				System.out.print("출금액: ");
				atm.withdraw(sc.nextInt());
				break ;

			case 3://잔액
				System.out.println("----잔액----");
				atm.balance();
				break ;

			default://종료
				System.out.println("ATM 사용을 종료합니다.");
				break outer;
			}

		}

	}// main
}
