package ex4_thread_work;

public class ThreadTest extends Thread {
	
	public void setNum(int num) {
		this.num = num;
	}

	private int num = 0;
	
	
	@Override
	public void run() {
		// ���ο��� ����ڰ� �Ѱ��� ���� 1�� �������� ���ҽ�Ű�� ���
		
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
