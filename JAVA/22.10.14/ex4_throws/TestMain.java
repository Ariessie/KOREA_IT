package ex4_throws;

public class TestMain {

	public static void main(String[] args)  {
		
		
		Ex1_Throws e1 = new Ex1_Throws();
		Ex2_Throws e2 = new Ex2_Throws();
		
		try {
			e1.info();
			e2.info();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
