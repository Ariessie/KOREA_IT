package ex2_scanner;

import java.util.Scanner;

//ctrl + shift + o
public class Ex1_Scanner {

	public static void main(String[] args) {
		//Scanner
		//Ű���� ���� �Է¹ޱ� ���� Scanner Ŭ����
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("����: ");
		int num = sc.nextInt(); //������ �Է� �޴� ���
		System.out.println("�Է¹��� ��: "+num);
		
		System.out.print("����: ");
		String name = sc.next(); //������ �Է� �޴� ���
		System.out.println("����� �̸��� "+name);
		

	}

}
