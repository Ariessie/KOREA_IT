package ex2_scanner;

import java.util.Scanner;

//ctrl + shift + o
public class Ex1_Scanner {

	public static void main(String[] args) {
		//Scanner
		//키보드 값을 입력받기 위한 Scanner 클래스
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("정수: ");
		int num = sc.nextInt(); //정수를 입력 받는 기능
		System.out.println("입력받은 값: "+num);
		
		System.out.print("문장: ");
		String name = sc.next(); //문장을 입력 받는 기능
		System.out.println("당신의 이름은 "+name);
		

	}

}
