package ex1_work;

import java.util.Random;

public class WordScramble {

		//���� �ܾ ��ȯ�ϰ�, ������ �����ϱ� ���� Ŭ����
		// ����
		
		String[] strArr = {"HOPE", "ANNANAS", "DOCTOR","AIRPLANE"};
		
		String shake="";
		
		//������ �������� ��ȯ�ϴ� �޼���
		
		public String getAnswer() {
			int idx = new Random().nextInt(strArr.length);
			return strArr[idx];
			
		}
		
		public String getQuestion(String str) {
			
			//����ܾ��� �� ��ŭ �迭�� �����Ͽ� �ߺ����� �ʴ� ������ ����.
			
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
