package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		String[] data = {"apple", "banana", "grape","strawberry"};
		WordGame wg = new WordGame(arr, data);
		//객체를 파라미터로 넘기면 주소가 넘어감
		
		wg.start(); //스레드 동작
		
		Scanner sc = new Scanner(System.in);
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		 while(true) {
			
			 if (arr.size() == 0) {
					System.out.println("클리어!!");
					wg.setPlaying(false);
					break;
				}
			 
			System.out.println(arr);
			System.out.print(">> ");
			String in = sc.next();
			
			//사용자가 입력한 단어와 일치하는 값을 arr에서 검색
			
			for (int i = 0; i < arr.size(); i++) {
				
				if (in.equals(arr.get(i))) {
					arr.remove(i);
					break;
				}
				
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
