package ex3_updown;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {

		/*
		 * ���� : 25
		 * down
		 * ���� : 10
		 * up
		 * ���� : 17
		 * 3ȸ���� ����!
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		GameClass gc = new GameClass();
		int su = 0;
		
		
		 while(true) {
			
			//�����̶�� �����Ǵ� ���� Ű���忡�� �Է¹ޤ�,
			// GAMECLASS�� check()�޼��忡�� �����ش�
			//����ó���� �Ϸ�Ǹ� ���� Ŭ������ ���� �ݺ����� while�� ������������ �Ͻÿ�.
			
			System.out.print("����:");
			int num = sc.nextInt();
			boolean res = gc.check(num);
			
			if (res == true) {
				//����ó���� �Ϸ�� ��� while Ż��
				break ;
			}
			
		}
		
		
	}//main
}
