package ex2_single_for;

import java.util.Scanner;

public class Ex4_for {

	public static void main(String[] args) {
		/* 
		Ű���忡�� n1, n2�� �������� �Է� �޴´�
		n1~n2������ ���� ���
		(ex. 2,5, -> 2+3+4+5=14)
		      ��1 : 2
		     ��2 : 5
		   ��� : 14
		   
		   
		
		
		*/
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.print("��1: ");
		int n1 = sc.nextInt();
		System.out.print("��2: ");
		int n2 = sc.nextInt();
		
		//���� (�� ������ ���� �ٲٴ� �ڵ�)
		if(n1> n2) {
			int n3 = n1;
			n1 = n2;
			n2= n3;
		} //if
		
			for (int i = n1 ; i <= n2 ;i++  ) {
			
			result += i;
		
		}//for
		System.out.println("���: "+result);
		
		
	}//main

}
