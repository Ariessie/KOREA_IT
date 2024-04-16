package ex1_work;

import java.util.Random;

public class WordScramble {

		//정답 단어를 반환하고, 문제를 출제하기 위한 클래스
		// 답지
		
		String[] strArr = {"HOPE", "ANNANAS", "DOCTOR","AIRPLANE"};
		
		String shake="";
		
		//정답을 메인으로 반환하는 메서드
		
		public String getAnswer() {
			int idx = new Random().nextInt(strArr.length);
			return strArr[idx];
			
		}
		
		public String getQuestion(String str) {
			
			//정답단어의 수 만큼 배열을 생성하여 중복되지 않는 난수를 넣자.
			
			int[] inArr = new int[str.length()];
			
			outer: for (int i = 0; i<inArr.length;) {
			
				
				inArr[i] = new Random().nextInt(str.length());
				
				for (int j = 0; j <i; j++) {
					if (inArr[i]==inArr[j]) {
						continue outer;
					}
				}//inner
				
				i++;
			
				
			}//outer
			
			for (int i = 0; i < str.length(); i++) {
				shake += str.charAt(inArr[i]);
			}
			return shake;
			
		}
		

	

}
