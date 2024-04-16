package ex1_string;

import java.util.Scanner;

public class Ex4_String {

	public static void main(String[] args) {
		// 키보드에서 이메일의 입력받고 @앞의 id가 6미만 10초과일 경우 형식이 올바르지 않다는 베세지 출력
		
		//메일: wldondjok@naver.com
		// - 님 환영합니다.
		// 이메일 형식이 올바르지 않음
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메일: ");
		String mail = sc.next();
		
//		index = name.indexOf('g'); //특정 문자를 발견하지 못했다면 -1이 반환
//		System.out.println("맨 처음 발견한 문자 g의 위치: "+index);
		
		String str = mail.substring(0, mail.indexOf('@'));
	
		
		
		if(str.length() <6 || str.length() > 10) {
			System.out.println("이메일 형식이 올바르지 않습니다.");
		}System.out.println(str+"님 환영합니다");
		
		
		
	}

}
