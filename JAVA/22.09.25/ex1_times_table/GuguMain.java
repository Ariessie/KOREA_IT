package ex1_times_table;

import java.util.Scanner;

public class GuguMain {

	public static void main(String[] args) {
		// 단: 3
		// 입력 받은 값 파라미터
		// 해당 단 출력
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단: ");
		int num = sc.nextInt();
		
		GuguClass gugu = new GuguClass();
	
		 gugu.showTable(num);
		
		
		
		
		
		
		

}//main
}

