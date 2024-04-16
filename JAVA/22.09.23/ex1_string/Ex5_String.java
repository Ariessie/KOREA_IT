package ex1_string;

import java.util.Scanner;

public class Ex5_String {

	public static void main(String[] args) {
		//키보드에서 값을 입력받고, 회문수인지 아닌지 판단하기
		// 회문수란 앞으로 읽어도, 뒤에서 읽어도 똑같이 읽히는 숫자
		
		//값: ab11ba
		//ab11ba는 회문수 입니다.
		// -는 회문수가 아닙니다.
		//length, charAt, equals
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";//키보드에서 입력받은 원본값
		String rev = ""; //원본을 뒤집어서 저장할 변수

		System.out.print("값: ");
		str = sc.next(); //abc로 가정
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			
			rev += str.charAt(i);
			
		}//for
		
		
//		System.out.println(rev);
		
		
		if (str.equals(rev)) {
			System.out.println(str+"은 회문수 입니다");
		}else {
			System.out.println(str+"은 회문수가 아닙니다.");
		}
		
		
		System.out.println(""+'a'+'b');
		

	}

}
