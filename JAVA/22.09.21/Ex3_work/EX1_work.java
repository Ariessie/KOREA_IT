package Ex3_work;

import java.util.Scanner;

public class EX1_work {

	public static void main(String[] args) {
		
		
		//Ű���忡�� ������ �Է¹ް�, �Է¹��� ������ �Ҽ� ���� �Ǵ��ϴ� �ڵ�
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();
		
		int i = 0;
		
		
		for(i = 2; i <= num; i++) {
			
			
		if(num % i == 0) {
			break;
		}
		} //for	
		
		if (num == i) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
			
			
	
		
		
		
		
		
		
		
		
	}
}
