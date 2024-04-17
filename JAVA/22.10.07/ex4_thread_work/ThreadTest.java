package ex4_thread_work;

public class ThreadTest extends Thread {
	
	public void setNum(int num) {
		this.num = num;
	}

	private int num = 0;
	
	
	@Override
	public void run() {
		// 메인에서 사용자가 넘겨준 값을 1초 간격으로 감소시키며 출력
		
		for (int i = num; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		
		
		
	}
}
