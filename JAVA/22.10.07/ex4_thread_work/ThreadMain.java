package ex4_thread_work;

import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) {
		
		//����: 5
		//
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		
		
		ThreadTest t = new ThreadTest();
		t.setNum(sc.nextInt()); 
		t.start();
		

	}

}
