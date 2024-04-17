package ex6_daemon;

public class DaemonMain {

	public static void main(String[] args) {
		
		DaemonTest r = new DaemonTest();
		Thread t = new Thread(r);
		//����(Daemon)������
		//���󽺷���� ���ν������� �۾��� ���� �������� ������ �����ϱ� ���� �������.
		//���󽺷��带 ȣ����(���۽�Ų) �����尡 ����Ǹ�, ���󽺷��嵵 �Բ� ����ȴ�.
		t.setDaemon(true);
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("������ "+i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("���α׷�����");
		
	}

}
