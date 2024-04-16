package ex4_thread_work;

import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) {
		
		//정수: 5
		//
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		
		
		ThreadTest t = new ThreadTest();
		t.setNum(sc.nextInt()); 
		t.start();
		

	}

}
