package ex5_array_work;

import java.util.Scanner;

public class Ex2_work {

	public static void main(String[] args) {
		// �迭�� ���̴�? : 5 -> ���̰� 5�� �迭�� ����� �ȴ�.
		// ��� ���� 
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���̴�?: ");
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
