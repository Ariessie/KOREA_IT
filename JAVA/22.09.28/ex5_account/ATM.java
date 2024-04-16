package ex5_account;

public class ATM {

	private int money;

	// 입금
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금성공");
	}

	// 출금
	public void withdraw(int money) {

		if (this.money - money<0) {
			System.out.println("잔액부족");
		} else {
			this.money -= money;
			System.out.println("출금성공");
		}

	}
	
	// 잔액확인

	public void balance () {
		System.out.println("잔액: "+ money);
	}
	
	
	
	
	
	
}
