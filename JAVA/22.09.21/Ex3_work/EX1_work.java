package Ex3_work;

import java.util.Scanner;

public class EX1_work {

	public static void main(String[] args) {
		
		
		//키보드에서 정수를 입력받고, 입력받은 정수가 소수 인지 판단하는 코드
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int i = 0;
		
		
		for(i = 2; i <= num; i++) {
			
			
		if(num % i == 0) {
			break;
		}
		} //for	
		
		if (num == i) {
			System.out.println(num + "은 소수입니다.");
		}else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
			
			
	
		
		
		
		
		
		
		
		
	}
}
