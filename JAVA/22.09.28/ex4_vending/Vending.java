package ex4_vending;

import java.util.Random;

public class Vending {

	private Can[] can = new Can[5];
	private int money;

	// 자판기에 음료수를 세팅

	public Vending() {
		can[0] = new Can("fanta", 1000);
		can[1] = new Can("cider", 1200);
		can[2] = new Can("orange", 1400);
		can[3] = new Can("banana", 1500);
		can[4] = new Can("coke", 1600);

	}
//		for (int i = 0; i < can.length; i++) {
//			can[i] = new Can();
//		}

//		can[0].setName("fanta");
//		can[0].setPrice(1000);
//		
//		can[1].setName("cider");
//		can[1].setPrice(1100);
//		
//		can[2].setName("orange");
//		can[2].setPrice(1200);
//		
//		can[3].setName("banana");
//		can[3].setPrice(1300);
//		
//		can[4].setName("coke");
//		can[4].setPrice(1400);

//	}//init 초기화

	public void showCans(int money) {

		this.money = money;
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.printf("%s-%d원\n", can[i].getName(), can[i].getPrice());
			}

		} // for

	}// showcans

	public void outCan(String name) {

		for (int i = 0; i < can.length; i++) {
			if (can[i].getName().equalsIgnoreCase(name)) {

				System.out.printf("%s선택함\n", name);
				System.out.printf("잔액: %d\n", money - can[i].getPrice());

			}
		}

	}

}
