package ex1_single_array;

import java.util.Random;

public class Ex1_single_array {

	public static void main(String[] args) {
		// ����  money�� 1-~5000������ ������ �����.
		//��, 3450, 2100�� ���� 1�� �ڸ� ���ڴ� �ݵ�� 0���� �����.
		//���� money�� �������� �ٲ�����
		//500,100,50,10��¥�� ������ ���� � �Ž��� ������ �Ǵ��� ��
		//��, ������ ���� ���� �������� �Ž��� �־�� �Ѵ�.
		
		//�ݾ� :2590 <--����
		// 500: 5
		// 50: 1
		// 10: 4
		
	
	
		int[] coin = {500, 100, 50, 10};
		int money = (new Random().nextInt(500-10+1)+10)*10;
//		outer: for (int i = 0; i < coin.length; ) {
//			
//	    	money = new Random().nextInt(5000-10+1)+10;
//			
//	    	if (money % 10 != 0) {
//				continue outer;
//			}
//	    	
//	    	i++;
//	    	
//		}//outer
		
		System.out.println("�ݾ�: "+money);
		
		
		for (int i = 0; i < coin.length; i++) {
			
			int res = money /coin[i];
			if ( res > 0 ){
				System.out.printf("%d��: %d��\n",coin[i],res);
				money %= coin[i];
			}
			
			
			
		}//for
		
		
		
		
		
		
//		
//		int c500 = money/coin[0];
//		
//		
//		System.out.println("500��: "+c500);
//		
//		money -= c500*coin[0];
//		
//		int c100 = money/coin[1];
//		System.out.println("100��: "+c100);
//		
//		money -= c100*coin[1];
//		
//		int c50 = money/coin[2];
//		System.out.println("50��: "+c50);
//		
//		money -= c50*coin[3];
//		
//		int c10 = money/coin[3];
//		System.out.println("10��: "+c10);
//	
		
		
		
		
		
	}//main
	

}
