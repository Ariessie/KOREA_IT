package ex1_work;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{

	int su1,su2;
	int timer = 0;
	int playCount = 0; //정답을 맞힌 경우에만 1씩 증가
	boolean isCheck = true;
	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);
	
	
	//문제 출제 및 정답 판별 메소드
	
	public void startGame() {
		
		
		while (isCheck) {
			
			su1 = rnd.nextInt(100)+1;
			su2 = rnd.nextInt(100)+1;
			System.out.printf("%d + %d = ",su1,su2);
			int result = sc.nextInt();
		
			if (result == su1+su2) {
				System.out.println("정답!");
				playCount++;
			}else {
				System.out.println("오답...");
				
			}//else
			
			//게임 종료체크 
			
			if (playCount == 5) {
				System.out.printf("%d초 걸렸습니다.",timer);
				isCheck = false;
			}
			
			
		}//while
	}
	
	
	
	//5문제가 정답처리 될때까지 시간을 계산
	
	@Override
	public void run() {		
		while(isCheck) {
			
			try {
				Thread.sleep(1000);
				timer++;
			} catch (InterruptedException e) {
				
			}	
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
