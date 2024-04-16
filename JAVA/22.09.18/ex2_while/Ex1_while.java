package ex2_while;

public class Ex1_while {

	public static void main(String[] args) {
		/*
		 
		  #day 5 
		  
		   [ while문 ]
		   : 간단한 구성을 가진 반복문 (선 비교 후 처리)
		   	 while(조건식){ 조건식이 참일 때 실행되는 영역 }
		  
		 	무한반복 코드 : 조건식이 언제나 true이기 때문에 무한반복 된다.
		 	while (true) {  }
		  
		   [ do-while문 ] *Ex2_do_while
		  	: 선 처리, 후 비교
		  	: 제어문 중 유일하게 ;으로 끝난다.
		  	
		  	
		  	[ break ] *Ex1_break
		  	: 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나가기 위한 키워드
		  	: break 바로 아래에는 어떤 코드도 동작하지 않는다.
		  	
		  	[continue문] *Ex1_continue
		  	 : 반복문 내에서 특정 문장을 건너뛸 때 사용하는 키워드
		  	 : continue문 바로 아래에는 어떤 코드도 동작하지 않는다.
		  	 : for문 안에서 동작하는 continue문은 기본적으로 가장 가까운 for문의 증감식으로 간다.
			 : for문에 증감식이 없다면, continue는 증감식을 무시하고 조건식으로 가낟.
		 
		 */

		
		int num = 1;
		while(num <= 5) {
			System.out.println(num++);
			
		}
		
		
	}

}
