package ex2_multi_thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		
		
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		Thread03 t3 = new Thread03();
		
		//인접한 위치에서 다수의 스레드를 실행하면 어떤 스레드가 먼저 동작할지,
		//어떤 스레드가 먼저 마무리 될지 절대로 알 수 없다.
		t1.start();
		t2.start();
		t3.start();
		
		
		

	}

}
