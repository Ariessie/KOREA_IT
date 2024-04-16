package ex1_control_statement;

public class Ex1_if {

	public static void main(String[] args) {
		/*
		  #day3
		  
		  [ 제어문 ]
		   : 프로그램의 흐름을 제어하는 문장
		   : 분기문과 반복문으로 나뉜다.
		   
		   1. 분기문 : if, switch
		   2. 반복문 : for, while
		   
		   
		  [ 분기문 ] 
		   < 단순 if문 > *Ex1_if
		     if(조건식) { 조건식이 참일때 실행되는 영역  }
				
		   < if-else문 > *Ex2_if_else
		    : if의 조건식이 참이라면 else문은 무시한다.
		   	 if (조건식){ 조건식이 참일때 실행되는 영역 } else{ 조건식이 거짓일때 실행되는 영역 }
			  
		   < 다중 if문 >  *Ex4_else_if
			: 여러개의 조건 비교가 필요할 때 사용하는 if문
		    if (조건식){ 조건식이 참일때 실행되는 영역 } 
		     else if (조건식) { 조건식이 참일때 실행되는 영역 }
		       else { 위의 조건식이 모두 거짓일 때 마지막에 반드시 호출되는 영역}
		       
		    < switch-case문 > *Ex5_switch
		    : 비교값을 통해 조건값과 값을 비교하여 결과를 도출하는 제어문
		    : break를 만나면 switch문을 완전히 빠져 나온다
		    	    
		    switch(비교값){
		      case 조건값:
		           	비교값과 조건값이 일치할때 호출되는 영역	
		           	break; 
		           	
		      default:
		      		비교값과 조건값이 일치하는 것이 없는 경우 호출되는 영역
		       		break;
		           	}
		    
		     switch문의 규칙
		     1. 조건값은 중복되게 만들지 않는다.
		     2. 비교값과 조건값은 자료형 타입이 반드시 일치해야 한다.
		     3. 비교값으로 사용 가능한 자료형 타입이 있다. 
		     	- 정수형 : byte, short, int
		     	- 문자형 : char
		     	- 문자열 : String
		    
		       
		       
		       
		       
		       
		       
		
		
		 */

		
		//if문
		int n = 51;
		//char ch = 'A'; -> 문자
		String str = ""; //문자열
		
		
		if(n == 50) {
			str = "n은 50입니다.";
			
		}
		
		if(n != 50) {
			str = "n은 50이 아닙니다.";
		}
		
		System.out.println(str);
		
	}

}
