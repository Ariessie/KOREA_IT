package ex3_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {
		// Scanner�� switch���� Ȱ���Ͽ� �Ʒ��� ����� �ϼ��Ͻÿ�
		
		//��1 : 10
		// ��2 : 30
		//������ : +
		//10+30 = 40
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		System.out.println("��1: "+num);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int num2 = sc.nextInt();
		System.out.println("��2: "+num2);

		System.out.print("�����ڸ� �Է��Ͻÿ�: ");
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
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
		
		
		
		
		
	}

}
