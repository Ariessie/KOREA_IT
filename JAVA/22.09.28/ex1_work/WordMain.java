package ex1_work;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer(); //������ �޴´�
		
		//������ �� ������ �����ش�.
		String question=ws.getQuestion(answer);
		
		System.out.println("����: "+question);
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("����:");
			String str = sc.next();
			
			//����ڰ� �Է¹޴� ���� ������ ������ ��ġ�ϴ��� Ȯ��
			if (answer.equalsIgnoreCase(str)) {
				System.out.println(str+"�� �����Դϴ�.");
				break;
			}else 
				System.out.println(str+"�����Դϴ�");
			
		}
		
		
		
		
		
		
	}

}
