package ex3_thread_sleep;

public class ThreadTest extends Thread {

	 @Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000); //1�ʴ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("������: "+i);
		}
	}
	
	
}
