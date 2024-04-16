package ex3_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {

	public static void main(String[] args) {
		// RspInfo 클래스를 활용하여 가위바위보 게임을 시작
		
		//id : a
		//가위 (s) | 바위 (r) | 보 (p) : r
		//1승 0무 0패
		//다시 하시겠습니까? y | n : n
		///게임을 종료합니다.
		
	
		RspInfo rsp = new RspInfo();
		Scanner sc = new Scanner(System.in);
		
		String id= "";
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.print("id: ");
		id = sc.next();
		rsp.setId(id);
		
		ScoreLoader sl = new ScoreLoader(id);
		//로드
		try {
			
			win = sl.getRsp().getWin();
			lose = sl.getRsp().getLose();
			draw = sl.getRsp().getDraw();
			
			rsp.setWin(win);
			rsp.setLose(lose);
			rsp.setDraw(draw);
		} catch (Exception e) {
			
		}
		
		
		System.out.printf("%d승 %d무 %d패\n",win,draw,lose);	
		
		while (true) {
			
			int rnd = new Random().nextInt(3);
			//0:가위, 1:바위, 2:보
			System.out.print("가위 (s) | 바위 (r) | 보 (p) : ");
			String user = sc.next();
			
			int usercnt = 0;
			if (user.equalsIgnoreCase("s")) {
				usercnt = 0;
			}else if (user.equalsIgnoreCase("r")) {
				usercnt = 1;
			}else if (user.equalsIgnoreCase("p")){
				usercnt = 2;
			}
			
			
			//경우의 수
			
			if (usercnt - rnd == -2 || usercnt - rnd == 1) {
				System.out.println("이겼습니다.");
				rsp.setWin(++win);
			}else if (usercnt - rnd == 0) {
				System.out.println("비겼습니다");
				rsp.setDraw(++draw);
						
			}else{
				System.out.println("졌습니다");
				rsp.setLose(++lose);
			}
			
			System.out.printf("%d승 %d무 %d패\n",rsp.getWin(),rsp.getDraw(),rsp.getLose());	
			
			
			System.out.print("다시 하시겠습니까? y | n : ");
			if (!sc.next().equalsIgnoreCase("y")) {
				break;
			}
			
		}//while
		
		System.out.println("게임종료");
		
		new ScoreSave(rsp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
