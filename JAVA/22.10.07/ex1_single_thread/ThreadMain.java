package ex1_single_thread;

public class ThreadMain {

	public static void main(String[] args) {
	  
		SingleThread t = new SingleThread();
		t.start(); //start는 run 메소드를 백그라운드에서 동작시키기 위한 메서드

		System.out.println("메인스레드 종료");
		
	}

}
