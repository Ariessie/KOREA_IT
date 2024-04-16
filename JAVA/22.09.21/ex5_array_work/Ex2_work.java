package ex5_array_work;

import java.util.Scanner;

public class Ex2_work {

	public static void main(String[] args) {
		// 배열의 길이는? : 5 -> 길이가 5인 배열을 만들면 된다.
		// 모든 방의 
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이는?: ");
		int su = sc.nextInt();
		
		
		char[] ch = new char[su];
//		int a = 'A';
		
		
		for (int i = 0; i <ch.length; i++) {
//			ch[i] = (char)a ;
//			a++;
				
			ch[i] = (char)('A'+i);
			
			System.out.print(ch[i]);
		}
		
		
		

	}

}
