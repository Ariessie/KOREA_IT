package ex6_daemon;

public class DaemonTest implements Runnable {

	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(3000);
				System.out.println("�ڵ�������...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while
		
	}//run

	
	
	
	
	
	
	
}
