package ex1_string;

public class Ex2_String_Method {

	public static void main(String[] args) {
		
		
		
		String name = "Hong Gil Dong";
		
		int index = name.length();
		System.out.println("문자열 name의 길이: " + index);
		
		index = name.indexOf('g'); //특정 문자를 발견하지 못했다면 -1이 반환
		System.out.println("맨 처음 발견한 문자 g의 위치: "+index);
		
		
		index = name.indexOf("Gill");
		System.out.println("문장 Gill의 시작 위치: "+index);
		
		index = name.lastIndexOf('o');
		System.out.println("마지막 문자 o의 위치: "+index);
		
		char c = name.charAt(5);
		System.out.println("추출한 5번째 위치의 문자: "+c);
		
		
		String a = name.substring(0); //첫번째 문자 제거
		a = name.substring(0,4); //첫번째에서 4번째 문자까를 제외한 문자 제거
		
		
		String fruit1 = "apple";
		String fruit2 = "Apple";
		
		if (fruit1.equals(fruit2)) { //equals는 대소문자를 구별하여 값을 비교한다.
			System.out.println("값이 같다");
		}else {
			System.out.println("값이 다르다");
		}
		
		//equalsIgnoreCase는 대소문자를 무시하고 단어가 일치하면 true를 반환
		if (fruit1.equalsIgnoreCase(fruit2)) {
			System.out.println("값이 같다");
		}else {
			System.out.println("값이 다름");
		}
		
		
		String myId = " jyh ";
		String result = myId.trim();
		if (myId.equals("jyh")) {
			System.out.println("로그인 성공!");
		}
		
		//숫자형식의 문자열 ("10")을 실제 정수로 바꿔주는 메서드
		String number = "10";
		
		int n = Integer.parseInt(number);
		System.out.println(n+10);
		
		
		
		
	}

}
