package ex2_multi_thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		
		
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		Thread03 t3 = new Thread03();
		
		//������ ��ġ���� �ټ��� �����带 �����ϸ� � �����尡 ���� ��������,
		//� �����尡 ���� ������ ���� ����� �� �� ����.
		t1.start();
		t2.start();
		t3.start();
		
		
		

	}

}
