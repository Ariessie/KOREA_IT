package ex3_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {
		// Scanner와 switch문을 활용하여 아래의 결과를 완성하시오
		
		//수1 : 10
		// 수2 : 30
		//연산자 : +
		//10+30 = 40
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("수를 입력하시오: ");
		int num = sc.nextInt();
		System.out.println("수1: "+num);
		
		System.out.print("수를 입력하시오: ");
		int num2 = sc.nextInt();
		System.out.println("수2: "+num2);

		System.out.print("연산자를 입력하시오: ");
		String str = sc.next();
				
		
		switch (str) {
		case "+" : 
			System.out.printf("%d + %d = %d\n",num,num2,num+num2);
			break;
		case "*" : 
			System.out.printf("%d * %d = %d\n",num,num2,num*num2);
			break;
		case "/" : 
			System.out.printf("%d / %d = %d\n",num,num2,num/num2);
			break;
		case "-" : 
			System.out.printf("%d - %d = %d\n",num,num2,num-num2);
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		
		
		
		
		
	}

}
