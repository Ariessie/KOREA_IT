package ex1_work;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer(); //정답을 받는다
		
		//가지고 온 정답을 섞어준다.
		String question=ws.getQuestion(answer);
		
		System.out.println("문제: "+question);
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("정답:");
			String str = sc.next();
			
			//사용자가 입력받는 값과 문제의 정답이 일치하는지 확인
			if (answer.equalsIgnoreCase(str)) {
				System.out.println(str+"는 정답입니다.");
				break;
			}else 
				System.out.println(str+"오답입니다");
			
		}
		
		
		
		
		
		
	}

}
