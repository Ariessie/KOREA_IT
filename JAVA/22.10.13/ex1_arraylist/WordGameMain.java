package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		String[] data = {"apple", "banana", "grape","strawberry"};
		WordGame wg = new WordGame(arr, data);
		//��ü�� �Ķ���ͷ� �ѱ�� �ּҰ� �Ѿ
		
		wg.start(); //������ ����
		
		Scanner sc = new Scanner(System.in);
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		 while(true) {
			
			 if (arr.size() == 0) {
					System.out.println("Ŭ����!!");
					wg.setPlaying(false);
					break;
				}
			 
			System.out.println(arr);
			System.out.print(">> ");
			String in = sc.next();
			
			//����ڰ� �Է��� �ܾ�� ��ġ�ϴ� ���� arr���� �˻�
			
			for (int i = 0; i < arr.size(); i++) {
				
				if (in.equals(arr.get(i))) {
					arr.remove(i);
					break;
				}
				
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
