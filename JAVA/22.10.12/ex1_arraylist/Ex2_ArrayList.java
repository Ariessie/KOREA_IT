package ex1_arraylist;

import java.util.ArrayList;

public class Ex2_ArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("박길동");
		list.add("이순신");
		list.add("강감찬");
	

		list.add(1, "심사인당");
		list.set(3, "김순신");
		list.remove(4);
		
		System.out.println(list);
		
		
		

	}

}
