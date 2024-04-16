package ex4_throws;

public class Ex1_Throws {
	
	//throws 현재 클래스에서 발생하는 예외를 타 클래스에서 해결하도록 위임하는 것.
	

	public void info() throws InterruptedException {

		
			Thread.sleep(1000);
			System.out.println("1번 클래스");
		
	}

}
