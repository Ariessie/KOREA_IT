package ex1_work;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{

	int su1,su2;
	int timer = 0;
	int playCount = 0; //������ ���� ��쿡�� 1�� ����
	boolean isCheck = true;
	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);
	
	
	//���� ���� �� ���� �Ǻ� �޼ҵ�
	
	public void startGame() {
		
		
		while (isCheck) {
			
			su1 = rnd.nextInt(100)+1;
			su2 = rnd.nextInt(100)+1;
			System.out.printf("%d + %d = ",su1,su2);
			int result = sc.nextInt();
		
			if (result == su1+su2) {
				System.out.println("����!");
				playCount++;
			}else {
				System.out.println("����...");
				
			}//else
			
			//���� ����üũ 
			
			if (playCount == 5) {
				System.out.printf("%d�� �ɷȽ��ϴ�.",timer);
				isCheck = false;
			}
			
			
		}//while
	}
	
	
	
	//5������ ����ó�� �ɶ����� �ð��� ���
	
	@Override
	public void run() {		
		while(isCheck) {
			
			try {
				Thread.sleep(1000);
				timer++;
			} catch (InterruptedException e) {
				
			}	
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
