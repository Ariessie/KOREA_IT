package ex5_account;

public class ATM {

	private int money;

	// �Ա�
	public void deposit(int money) {
		this.money += money;
		System.out.println("�Աݼ���");
	}

	// ���
	public void withdraw(int money) {

		if (this.money - money<0) {
			System.out.println("�ܾ׺���");
		} else {
			this.money -= money;
			System.out.println("��ݼ���");
		}

	}
	
	// �ܾ�Ȯ��

	public void balance () {
		System.out.println("�ܾ�: "+ money);
	}
	
	
	
	
	
	
}
