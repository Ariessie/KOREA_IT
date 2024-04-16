package ex1_random;

import java.util.Random;

public class Ex1_random {

	public static void main(String[] args) {
		
		//1~5사이의 난수
		// new Random().nextInt(난수범위)+시작수;
		// new Random().nextInt(큰수 - 작은수 +1)+시작수;
//		int num = new Random().nextInt(5)+1;
//		System.out.println(num);
		
		//난수로 알파벳 대문자들 중 하나를 출력하자
		
		int alpha = new Random().nextInt('Z'-'A'+1)+'A';
		
		
		System.out.println("결과: "+(char)alpha);
		
	}

}
