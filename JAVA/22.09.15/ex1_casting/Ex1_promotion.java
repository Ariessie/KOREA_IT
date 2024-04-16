package ex1_casting;

public class Ex1_promotion {

	public static void main(String[] args) {
		
		/*
		  		 	 	  
		  #day2 
		  
		  	[단축키]
		  	출력형식 : syso(sout) + ctrl + space 
		  
		    [ 캐스팅 (형변환) ]
		     : 담을 수 없는 것을 담을 수 있게 하는 것
		   
		   	1. promotion casting 프로모션 캐스팅 (자동으로 이뤄짐) *Exl_promotion
		        - 큰 자료형에 작은 자료형을 대입하는 것.  
			ex) double d = 100.5; (8byte)
				int n = 200; (4byte)
				d = n; (=은 오른쪽에 있는 것을 왼쪽에 집어 넣겠다는 의미)
				
			2. demotion casting 디모션 캐스팅 (자동으로 이뤄지지 x) *Ex2_demotion
			   - 작은 자료형에 큰 자료형이 대입되는 것
			   - 큰 자료형에서 작은 자료형으로 대입될 때, 그 만큼의 값의 손실이 발생할 수도 있다.
		    	ex)  값이 손실되지 않을 때
		 	    	 char c = 'A'; -> (2byte)
			    	 int n = c+1;  -> (4byte)
			    	 c = (char)n;
		
				ex) 값이 손실되는 경우
					float f = 5.5f; -> (4......byte)
					int num = 0; -> (4byte)
					num = (int)f;  -> 소수점이 날아간채 출력된다.
					
			[ 연산자 (Operator) ]
			  1. 최고연산자 : . , ()
			  2. 증감연산자 : ++ , -- 
			  3. 산술연산자 : + , - , * , / , %
			  4. 시프트연산자 : >> , <<
			  5. 비교연산자 : > , < , >= , <= , == , !=
			  6. 비트연산자 : & , |
			  7. 논리연산자 : && , || , !
			  8. 삼항(조건)연산자 : ? , :
			  9. 대입연산자 : = , *= , /= , %= , +=, -=

			[ 산술 연산자 ] *Ex1_Operator
			 : 4칙 연산과 나머지 연산자를 포함한다.
			 
			[ 대입 연산자] *Ex2_Operator
			 : 특정 값을 변수에 저장하여 기억시킬 때 사용하는 연산자
			 ex)  n1 += n2; (n1 = n1 + n2;)

			[ 비교 연산자] *Ex2_Operator
			: 변수의 값을 비교하여 참과 거짓을 판단하는 연산자
			: 결과는 반드시 boolean 형식으로 반환된다.
			
			> : 크다
			< : 작다
			

			[ 논리 연산자 ] *Ex3_Operator
			: 비교연산자를 통한 연산이 두 개 이상 사용되는 경우, 이를 연결하는 용도
			
			< &&(and) 연산자 > : 앞뒤가 모두 참이어야 참으로 결과가 나온다.
			 true && true = true
			 true && false = false
			 false && false = false
			 false && true = false
			 
			 && 연산은 앞쪽 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
			 
			 < ||(or) 연산자 > : 앞뒤가 모두 거짓이어야 거짓으로 결과가 나온다.
			  false || false = false
			  false || true = true
			  true || false = true
			  true || true = true
			 
			 || 연산은 앞쪽 연산이 참이면 뒤쪽 연산을 수행하지 않는다.
			 
			 
			 < !(not) 연산자 > : 참은 거짓으로, 거짓은 참으로 변환
			 !는 영구적으로 값을 바꾸지는 않는다. 
			 
			 
			 [ 비트 연산자 ] *Ex4_Operator
			  : 논리연산자와 유사하면서 bit단위(2진수)의 연산만 가능
			  : 일반적으로 시프트연산자와 함께 암호화, 복호화 작업에 사용되는 경우가 많다.
			  

				< 논리곱(and) >
				 : 2진수로 변환시 두 값이 모두 1일때만 1, 나머지는 0
					int a = 10;  //1010 
					int b = 7;   //0111
					int c = a&b; //0010 --> 2
						//둘다 1일 경우에만 1

				< 논리합(or) >
				 : 2진수로 변환시 두 값이 0일때만 0, 나머지는 1
				 c = a|b;
				 System.out.println("논리합: "+c);
				
				< 배타적or >
				 : 2진수로 변환시 값이 같으면 0, 다르면 1

			 [ 시프트 연산자 ] *Ex4_Operator
			  : 2진수 단위의 연산을 수행하되 오른쪽이나 왼쪽으로 이동해 값에 변화를 준다.


 			 [ 증감 연산자 ] *Ex5_Operator
			  : 1씩 증가시키거나, 1씩 감소시키는 연산자
				선행증감과 후행증감의 차이점을 반드시 알아둬야 한다.


	 		 [ 삼항(조건) 연산자 ] *Ex6_Operator
			  :하나의 조건식을 두고 조건식이 참일때와 거짓일때의 결과를 모두 돌려받을 수 있도록 하는 연산자
				  *조건식 (참, 거짓의 대답을 얻을 수 있는 모든 질문)
  				
  				(조건식) ? (참일때) : (거짓일때)


		 */
		
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n;
		
		System.out.println("d: "+d); //200.0으로 출력 된다.
		
	
		char c = 'A'; //2byte
		int n2 = 100; //4byte
		n2 = c; 
		
		System.out.println("n2: "+n2); //아스키코드로 변환하여 A는 65로 출력된다.
					
		
		
		
		
		
		
		
		
		
		

	}//main

}
