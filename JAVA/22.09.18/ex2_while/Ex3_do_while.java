package ex2_while;

import java.util.Random;

public class Ex3_do_while {

	public static void main(String[] args) {
		
		//java, jsp, android�� ������ �ô�.
		// �� ���� ������ �������� 0~130���� ����
		// do while�� ���� ���� ���� �� �Ѱ����� 100���� �Ѵ� ������ �ִٸ� �����
		// ���������� �������� ������ ��� 100�� �����϶� do-while�� ��������
		// ������ ȭ�鿡 ���
		
		// java : 87
		// jsp : 30
		// android : 102
		
		int java = 0;
		int jsp = 0;
		int and = 0;
		
		
		
		do{
						
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			and = new Random().nextInt(131);
					
		}while(java > 100 || jsp > 100 || and > 100 );
		
		System.out.println("java: "+java);
		System.out.println("jsp: "+jsp);
		System.out.println("android: "+and);
		
		
		

	}

}
