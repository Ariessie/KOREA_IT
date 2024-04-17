package ex5_runnable;

public class RunMain {

	public static void main(String[] args) {
		
		RunnableTest r = new RunnableTest();
		
		Thread t = new Thread(r);

		t.start();
		
		System.out.println("메인스레드 종료");
		
		
		
		
		

	}

}
