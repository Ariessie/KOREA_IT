package ex7_static;

public class BankMain {

	public static void main(String[] args) {
		
		
		
		Bank b1 = new Bank("����", "02-111-1111");
		Bank b2 = new Bank("����", "02-222-2222");
		Bank b3 = new Bank("�д�", "032-333-3333");

		b1.interest = 0.1f;
		
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
		
		
	}

}
