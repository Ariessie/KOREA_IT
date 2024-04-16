package ex6_daemon;

public class DaemonMain {

	public static void main(String[] args) {
		
		DaemonTest r = new DaemonTest();
		Thread t = new Thread(r);
		//데몬(Daemon)스레드
		//데몬스레드는 메인스레들의 작업을 돕는 보조적인 역할을 수행하기 위한 스레드다.
		//데몬스레드를 호출한(동작시킨) 스레드가 종료되면, 데몬스레드도 함께 종료된다.
		t.setDaemon(true);
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("게임중 "+i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램종료");
		
	}

}
