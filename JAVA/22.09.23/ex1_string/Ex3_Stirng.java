package ex1_string;

import java.util.Scanner;

public class Ex3_Stirng {

	public static void main(String[] args) {
		// Ű���忡�� �ƹ����̳� �������̷� �Է��� �޴´�. �Է¹��� ���ڿ� �ҹ��� a�� �� �� �ִ��� ȭ�鿡 ����Ͻÿ�
		
		
		// �Է�: djkfjajfewaifjajfljalkjfklaj
		// a�� ���� : 5��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		String str = sc.next();
		
		int num = 0;
				
		//char c = name.charAt(5);
		//System.out.println("������ 5��° ��ġ�� ����: "+c);
		
		for (int i = 0; i < str.length() ; i++) {
			
			if ( str.charAt(i) == 'a') {
				num++;
			}
			
			
		}
		
		
		System.out.println("a�� ����: "+num);
		
		
		
		

	}

}
