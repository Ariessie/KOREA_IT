package ex4_vending;

import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {

		Vending v = new Vending();
		

		//시용자가 투입한 금액으로 먹을 수 있는 음료 목룍 보여주기
		Scanner sc = new Scanner(System.in);
		System.out.print("inser coin: ");
		int money = sc.nextInt();
		
		v.showCans(money);
		System.out.print("음료선택: ");
		String select = sc.next();
		v.outCan(select);
		
		
		
		
		
		
		
		
		
	}

}
