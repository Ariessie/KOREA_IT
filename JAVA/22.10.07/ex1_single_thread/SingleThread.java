package ex1_single_thread;

public class SingleThread extends Thread{

	
	/*
	 	스레드는 독립적인 실행단위
	 	한번에 두 가지 이상의 프로세스를 동시다발적으로 실행 가능하게 해 주다.
	 	반드시 run메서드를 오버라이딩해야 한다.
	 	run메서드가 프로세스의 독립적인 수행을 가능하게 하는 영역이기 때문
	    
	  
	 */
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("스레드 실행");
			
		}//for
		
		
		
		
		
	}//run
	
	
	
	
	
	
	
	
	
}
