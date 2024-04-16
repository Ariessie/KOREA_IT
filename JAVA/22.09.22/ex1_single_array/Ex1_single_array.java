package ex1_single_array;

import java.util.Random;

public class Ex1_single_array {

	public static void main(String[] args) {
		// 변수  money에 1-~5000사이의 난수를 만든다.
		//단, 3450, 2100과 같이 1의 자리 숫자는 반드시 0으로 만든다.
		//난수 money를 동전으로 바꿨을때
		//500,100,50,10원짜리 동전이 각각 몇개 거슬러 지는지 판단할 것
		//단, 가능한 적은 수의 동전으로 거슬러 주어야 한다.
		
		//금액 :2590 <--난수
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
		
		System.out.println("금액: "+money);
		
		
		for (int i = 0; i < coin.length; i++) {
			
			int res = money /coin[i];
			if ( res > 0 ){
				System.out.printf("%d원: %d개\n",coin[i],res);
				money %= coin[i];
			}
			
			
			
		}//for
		
		
		
		
		
		
//		
//		int c500 = money/coin[0];
//		
//		
//		System.out.println("500원: "+c500);
//		
//		money -= c500*coin[0];
//		
//		int c100 = money/coin[1];
//		System.out.println("100원: "+c100);
//		
//		money -= c100*coin[1];
//		
//		int c50 = money/coin[2];
//		System.out.println("50원: "+c50);
//		
//		money -= c50*coin[3];
//		
//		int c10 = money/coin[3];
//		System.out.println("10원: "+c10);
//	
		
		
		
		
		
	}//main
	

}
