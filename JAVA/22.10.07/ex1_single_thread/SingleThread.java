package ex1_single_thread;

public class SingleThread extends Thread{

	
	/*
	 	������� �������� �������
	 	�ѹ��� �� ���� �̻��� ���μ����� ���ôٹ������� ���� �����ϰ� �� �ִ�.
	 	�ݵ�� run�޼��带 �������̵��ؾ� �Ѵ�.
	 	run�޼��尡 ���μ����� �������� ������ �����ϰ� �ϴ� �����̱� ����
	    
	  
	 */
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("������ ����");
			
		}//for
		
		
		
		
		
	}//run
	
	
	
	
	
	
	
	
	
}
