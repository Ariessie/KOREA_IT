package ex3_updown;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {

		/*
		 * 정답 : 25
		 * down
		 * 정답 : 10
		 * up
		 * 정답 : 17
		 * 3회만에 정답!
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		GameClass gc = new GameClass();
		int su = 0;
		
		
		 while(true) {
			
			//정답이라고 생각되는 값을 키보드에서 입력받ㅇ,
			// GAMECLASS의 check()메서드에게 보내준다
			//정답처리가 완료되면 현재 클래스의 무한 반복중인 while을 빠져나오도록 하시오.
			
			System.out.print("정답:");
			int num = sc.nextInt();
			boolean res = gc.check(num);
			
			if (res == true) {
				//정답처리가 완료된 경우 while 탈출
				break ;
			}
			
		}
		
		
	}//main
}
