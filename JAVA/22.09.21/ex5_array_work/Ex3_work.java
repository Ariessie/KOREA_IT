package ex5_array_work;

import java.util.Random;

public class Ex3_work {

	public static void main(String[] args) {
		// 1-45������ ������ �߻����� lotto�迭�� �ߺ����� �ʰ� ������� �� ȭ�鿡 ����Ͻÿ�

		
		int[] lotto = new int[6];
		
		outer: for (int i = 0; i < lotto.length; ) {
			 //������ �迭�� i��° index�� �߰�
			lotto[i] = new Random().nextInt(45)+1;
			
			//�ߺ����� ���ϴ� �ݺ���
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
					
			}
			
			System.out.print(lotto[i]+ " ");
			i++;
			
		}//outer
		
		
		
		
		
	}

}
