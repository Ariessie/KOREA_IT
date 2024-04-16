package ex6_static;

public class StaticTest {

	
	
	String str1 = "일반 멤버 변수";
	static String str2 = "스테틱 변수";
	
	
	public static void getString2 () {
	
		//static메서드에서는 일반 변수를 사용할 수 없다.
//		str1 ="안녕";
		str2 = "반가워";
		//static 매서드 내부에서는 static 지역변수를 생성할 수 없다.
//		static int num =10;
	}
	
	
	
	
	public void getString () {
		//일반 메서드에서 static변수와 일반변수 모두 사용할 수 있다.
		str1 = "안녕";
		str2 = "반갑습니다";
		
		int num1 = 10;
		//static 키워드를 가진 지역변수는 일반 메서드에서 사용불가
//		static int num2 = 10;
	}
	
	
	
	
	
	
	
}
