package ex7_work;

public class ThreadTime extends Thread{

	private boolean tf =true;
	public void setTf(boolean tf) {
		this.tf = tf;
	}
	
	int time = 0;
	
	@Override
	public void run() {
	
		
			while (tf) {
				
				try {
					Thread.sleep(1000);
					time++;
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		
		System.out.println(time+"√  ∞…∏≤");
		
		
	}
}
