package ex1_arraylist;

import java.util.ArrayList;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		
		//ArrayList : �÷����� �� �����ν� List�� �����ϴ� ��ǥ���� �ڽ� Ŭ����
		//Index�� ���̿� ������ ���� index��ȣ�� ���� ������ ����
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(300);
		list.remove(2); //2��° index�� 30�� ����
		list.add(100);
		list.set(2, 200); //2��° index�� �����͸� 200���� ����
		list.add(1,500); //
		//list.clear(); -> ����Ʈ�� ���� ��� ������ ���� (size()�� 0���� ����)
		
		System.out.println(list.get(2));
		
		
		System.out.println(list);
		System.out.println("����: "+list.size());
		
		
		
		//for���� ����Ͽ� list�� ���� ��� �����͸� ȭ�鿡 ���
		
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
