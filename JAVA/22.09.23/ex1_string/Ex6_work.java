package ex1_string;

import java.awt.print.Printable;
import java.util.Scanner;

public class Ex6_work {

	public static void main(String[] args) {
		// 
		
		//배우 검색: 이름 받기
		// [ma]
		// 범죄도시
		// 성난황소
		// 이웃사람
		
		//배우검색 : r
		// 해당 배우가 존재하지 않습니다.
		
		
		
		String[][] actor = {{"[song]", "박쥐", "괴물", "관상"},
							{"[kim]", "도둑들", "은밀하게..", "리얼"},
							{"[ma]", "범죄도시", "성난황소", "이웃사람"}};

		
		Scanner sc = new Scanner(System.in);
		System.out.print("배우검색: ");
		String search = sc.next();
		
		int cnt=0;
		
//		System.out.println(actor[2][0]);  -> 배우 이름 앞의 것만 바뀜 0->2
		
		
//		String act = search.substring(1,search.length()+1);
		
//		
			
		for (int i = 0; i < actor.length; i++) {
			
			if (actor[i][0].equals("["+search+"]")) {
				
				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}//inner
				
			}else {
				cnt++;
				if (cnt >= actor.length) {
					System.out.println("해당 배우가 없습니다.");
				}
			
			}
			
		}//outer
		
		
		
		
		
		
		
		
	}//main

}
