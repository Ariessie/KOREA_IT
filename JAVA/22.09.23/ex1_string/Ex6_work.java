package ex1_string;

import java.awt.print.Printable;
import java.util.Scanner;

public class Ex6_work {

	public static void main(String[] args) {
		// 
		
		//��� �˻�: �̸� �ޱ�
		// [ma]
		// ���˵���
		// ����Ȳ��
		// �̿����
		
		//���˻� : r
		// �ش� ��찡 �������� �ʽ��ϴ�.
		
		
		
		String[][] actor = {{"[song]", "����", "����", "����"},
							{"[kim]", "���ϵ�", "�����ϰ�..", "����"},
							{"[ma]", "���˵���", "����Ȳ��", "�̿����"}};

		
		Scanner sc = new Scanner(System.in);
		System.out.print("���˻�: ");
		String search = sc.next();
		
		int cnt=0;
		
//		System.out.println(actor[2][0]);  -> ��� �̸� ���� �͸� �ٲ� 0->2
		
		
//		String act = search.substring(1,search.length()+1);
		
//		
			
		for (int i = 0; i < actor.length; i++) {
			
			if (actor[i][0].equals("["+search+"]")) {
				
				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}//inner
				
			}else {
				cnt++;
				if (cnt >= actor.length) {
					System.out.println("�ش� ��찡 �����ϴ�.");
				}
			
			}
			
		}//outer
		
		
		
		
		
		
		
		
	}//main

}
