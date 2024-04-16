package ex2_single_for;

public class Ex1_for {

	public static void main(String[] args) {
		/*
		 #day 4
		 
		  [ formatter의 자료형 타입 ]
			%d : 정수 타입
			%c : 문자 타입
			%f : 실수타입
			%s : 문자열 타입
		 
		 
		  [ for문 ] *Ex1_for
		   : 특정 명령을 원하는 만큼 반복적으로 수행하기 위한 반복문
		   : for문 안에서만 사용 가능한 지역 변수를 만들 수 있다.
		 	for( 초기식; 조건식; 증감식;) { 조건식이 참일때 실행되는 영역 }
		  
		  i와 같이 특정 영역 안에서 초기화되어 만들어진 변수는 지역변수
		  
		  [ 다중for문 ] *Ex1_multifor
		  	: for문 안에 for문이 포함되어 있는 경우
		  	
		  
		 */
		int n = 20; //전역변수
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			n = 30;
		} //for
		
		System.out.println("---");
		for ( int i = 10; i > 0; i-- ) {
			System.out.println(i);
		} //for2

		int a = 1;
		for (a=0; a<=3;a++) {
			System.out.println(a);
		}
		
		
//		for(;a>=0;a--)
//		System.out.println(a);
//		
//		for(;;) {
//		System.out.println(a);
//		}
//		
		
		//문제 1부터 100까지 반복하는 for문을 만들고 그 안에서 3의 배수만 출력하시오
		
     	System.out.println("-----");
		
		for (int i = 1; i <= 100; i++) {
				if(i % 3 == 0 ) {
			System.out.println(i);
				} //if
				
				
			}//for
			
			
			
		
		
		
	}

}
