package ex1_string;

import java.util.Scanner;

public class Ex5_String {

	public static void main(String[] args) {
		//Ű���忡�� ���� �Է¹ް�, ȸ�������� �ƴ��� �Ǵ��ϱ�
		// ȸ������ ������ �о, �ڿ��� �о �Ȱ��� ������ ����
		
		//��: ab11ba
		//ab11ba�� ȸ���� �Դϴ�.
		// -�� ȸ������ �ƴմϴ�.
		//length, charAt, equals
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";//Ű���忡�� �Է¹��� ������
		String rev = ""; //������ ����� ������ ����

		System.out.print("��: ");
		str = sc.next(); //abc�� ����
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			
			rev += str.charAt(i);
			
		}//for
		
		
//		System.out.println(rev);
		
		
		if (str.equals(rev)) {
			System.out.println(str+"�� ȸ���� �Դϴ�");
		}else {
			System.out.println(str+"�� ȸ������ �ƴմϴ�.");
		}
		
		
		System.out.println(""+'a'+'b');
		

	}

}
