package ex4_try_catch;

import java.util.Scanner;

public class Ex3_try_catch {

	public static void main(String[] args) {
		// ���� : 1a0
		// ������ �Է��ϼ���
		
		
	Scanner sc = new Scanner(System.in);
	System.out.print("����: ");
	
		try {			
			int num = sc.nextInt();
			System.out.println("���: "+num);
		} catch (Exception e) {
			System.out.println("������ �Է��ϼ���");
					
		}
		
		
		
		
		
		
		

	}

}
