package ex4_try_catch;

import java.util.Scanner;

public class Ex4_try_catch {

	public static void main(String[] args) {
		
		//���� : 100
		//��� : 100
		
		
		//���� : aaa
		// aaa�� (��) ������ �ƴմϴ�.
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		String num = sc.next();
	
		
		
		try {
			
			int n = Integer.parseInt(num);
			System.out.println("���: "+n);
			
		} catch (Exception e) {
			System.out.println(num+"��(��) ������ �ƴմϴ�.");
		}
		
		
		
		
		

	}

}
