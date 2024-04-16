package ex2_while;

import java.util.Random;

public class Ex3_do_while {

	public static void main(String[] args) {
		
		//java, jsp, android의 시험을 봤다.
		// 각 과목별 점수는 랜덤으로 0~130점을 대입
		// do while을 통해 과목별 점수 중 한가지라도 100점이 넘는 과목이 있다면 재실행
		// 최종적으로 세과목의 점수가 모두 100점 이하일때 do-while을 빠져나와
		// 점수를 화면에 출력
		
		// java : 87
		// jsp : 30
		// android : 102
		
		int java = 0;
		int jsp = 0;
		int and = 0;
		
		
		
		do{
						
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			and = new Random().nextInt(131);
					
		}while(java > 100 || jsp > 100 || and > 100 );
		
		System.out.println("java: "+java);
		System.out.println("jsp: "+jsp);
		System.out.println("android: "+and);
		
		
		

	}

}
