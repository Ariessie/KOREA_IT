package ex1_string;

import java.util.Scanner;

public class Ex3_Stirng {

	public static void main(String[] args) {
		// 키보드에서 아무값이나 마구잡이로 입력을 받는다. 입력받은 문자에 소문자 a가 몇 개 있는지 화면에 출력하시오
		
		
		// 입력: djkfjajfewaifjajfljalkjfklaj
		// a의 갯수 : 5개
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String str = sc.next();
		
		int num = 0;
				
		//char c = name.charAt(5);
		//System.out.println("추출한 5번째 위치의 문자: "+c);
		
		for (int i = 0; i < str.length() ; i++) {
			
			if ( str.charAt(i) == 'a') {
				num++;
			}
			
			
		}
		
		
		System.out.println("a의 갯수: "+num);
		
		
		
		

	}

}
