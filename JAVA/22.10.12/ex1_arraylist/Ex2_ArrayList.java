package ex1_arraylist;

import java.util.ArrayList;

public class Ex2_ArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ȫ�浿");
		list.add("�ڱ浿");
		list.add("�̼���");
		list.add("������");
	

		list.add(1, "�ɻ��δ�");
		list.set(3, "�����");
		list.remove(4);
		
		System.out.println(list);
		
		
		

	}

}
