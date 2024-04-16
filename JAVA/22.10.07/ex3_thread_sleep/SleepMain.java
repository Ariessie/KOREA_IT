package ex3_thread_sleep;

public class SleepMain {

	public static void main(String[] args) {
		
		
		ThreadTest t = new ThreadTest();
		t.start();
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("main스레드 종료");

	}

}
