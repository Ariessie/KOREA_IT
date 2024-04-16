package ex1_overload;

public class OverloadTest {

	/*
	 메서드의 오버로딩
	 오버로딩은 메서드의 '중복정의'라고 하며, 하나의 클래스 내에서 같은 이름을
	 가진 메서드가 여러개 정의되는 상황을 말한다.
	 
	  @오버로딩의 규칙
	  
	  1) 오버로딩을 위한 메서드명은 대소문자를 비롯하여 반드시 똑같이 만든다.
	  2) 파라미터의 갯수가 달라야 한다.
	  3) 파라미터의 갯수가 같을 경우 타입이 달라야 한다.
	 4) 파라미터의 갯수와 타입이 같아도 순서가 다르며 오버로딩으로 인정된다.
	  
	 
	 */
	
	public void getResult() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void getResult(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	

	public void getResult(char n) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	public void getResult(String s) {
		System.out.println("문자열을 인자로 받는 메서드");
	}
	public void getResult(int num, String s) {
		System.out.println("정수와 문자열을 인자로 받는 메서드");
	}
	
	public void getResult(String s,int num) {
		System.out.println("문자열과 정수를 인자로 받는 메서드");
	}
	
	
	
	
	
	
	
	
	
	
}



