package ex1_string;

import java.util.Scanner;

public class Ex4_String {

	public static void main(String[] args) {
		// Ű���忡�� �̸����� �Է¹ް� @���� id�� 6�̸� 10�ʰ��� ��� ������ �ùٸ��� �ʴٴ� ������ ���
		
		//����: wldondjok@naver.com
		// - �� ȯ���մϴ�.
		// �̸��� ������ �ùٸ��� ����
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		String mail = sc.next();
		
//		index = name.indexOf('g'); //Ư�� ���ڸ� �߰����� ���ߴٸ� -1�� ��ȯ
//		System.out.println("�� ó�� �߰��� ���� g�� ��ġ: "+index);
		
		String str = mail.substring(0, mail.indexOf('@'));
	
		
		
		if(str.length() <6 || str.length() > 10) {
			System.out.println("�̸��� ������ �ùٸ��� �ʽ��ϴ�.");
		}System.out.println(str+"�� ȯ���մϴ�");
		
		
		
	}

}
