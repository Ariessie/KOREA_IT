package ex3_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Person> arr = new ArrayList<>();

		outer: while (true) {
			Person p1 = new Person();
			System.out.print("id: ");
			String id = sc.next();
			p1.setId(id);

			System.out.print("pw: ");
			p1.setPw(sc.nextInt());

			//id�ߺ�üũ
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).getId().equalsIgnoreCase(id)) {
					System.out.println("�̹� ��ϵ� ���̵� �Դϴ�");
					continue outer;
				}
			}
			
			arr.add(p1);

			for (int i = 0; i < arr.size(); i++) {
				System.out.printf("%s, %d\n", arr.get(i).getId(), arr.get(i).getPw());
			}
			System.out.println("-------------------");
		}

	}

}
