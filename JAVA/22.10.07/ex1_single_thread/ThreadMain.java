package ex1_single_thread;

public class ThreadMain {

	public static void main(String[] args) {
	  
		SingleThread t = new SingleThread();
		t.start(); //start�� run �޼ҵ带 ��׶��忡�� ���۽�Ű�� ���� �޼���

		System.out.println("���ν����� ����");
		
	}

}
