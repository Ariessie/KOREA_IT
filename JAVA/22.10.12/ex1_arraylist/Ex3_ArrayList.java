package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {

	public static void main(String[] args) {

		// id: aaa
		// arraylist�ȿ� ��Ƽ� ����ϱ�
		// [aaa]
		// id: bbb
		// [aaa,bbb]

		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		outer: while (true) {
			System.out.print("id: ");
			String id = sc.next();

			
			
			for (int i = 0; i < list.size(); i++) {
				
				if (id.equals(list.get(i))) {
					System.out.println("���̵� �ߺ�");
					continue outer;
				}
				
				
			}
			
			list.add(id);
			System.out.println(list);
			
			
			
			
			
			
		}	//while
			
		}//main

}
