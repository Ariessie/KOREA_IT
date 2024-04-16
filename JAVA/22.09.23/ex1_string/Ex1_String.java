package ex1_string;

public class Ex1_String {

	public static void main(String[] args) {
		/*
		  
		  #day 8
		  
		  [ String 클래스 ]
		   : String 클래스는 두 가지 특징을 가지고 있다.
		   1) 객체생성법이 두가지 (암시적, 명시적)
		   -> 클래스를 통해서 만드는 변수들
		   2) 한 번 생성된 문자열의 내용은 변하지 않는다. (불변의 특징)
		 
		   * == 연산자는 일반 변수를 비교할 때는 값이 같은지를 비교하는 코드지만, 
		               객체간의 비교에서는 주소값 비교의 코드로 사용된다.
		   * equals() 는 String의 값을 비교하는 메서드(기능)
		  
		  
		  
		  < 암시적 객체 생성 >
		   : 각 	String 객체가 가지는 값이 같을 경우 앞서 생성되니 객체 주소를 재사용하는 형식
		  
		      
		 < 명시적 객체 생성 >
		  new를 통해 만들어지는 모든 클래스는 명시적 객체 생성
		 
		 
		  [ String클래스의 메서드 ] *Ex2_String_Method
		  
		 : 메서드란 어떠한 작업을 수행하기 위한 명령문의 집합
		 
		 [ Wrapper클래스의 종류 ]
		  Integer => int
		  Character => char
		  Boolean => boolean
		  Byte  => byte
		  Short => short
		  Float => float
		  Double => double
		  Long => long
		 
		 
		 
		 */
		
		//암시적
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		// 
		if (s3 == s4) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
		
		
		//string 클래스의 값을 비교해보자
		
		if (s1.equals( s3)) {
			System.out.println("값이 같다");
		}
		
		
		System.out.println("string의 불변적 특징");
		
		String greet = "홍길동";
		greet += "안녕";
		System.out.println(greet);

		
		
		
		
		
		
		
		
	}

}
