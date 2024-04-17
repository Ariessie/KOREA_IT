package ex1_arraylist;

import java.util.ArrayList;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		
		//ArrayList : 컬렉션의 한 종류로써 List를 구현하는 대표적인 자식 클래스
		//Index의 길이에 제한이 없고 index번호로 직접 접근이 가능
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(300);
		list.remove(2); //2번째 index인 30을 제거
		list.add(100);
		list.set(2, 200); //2번째 index의 데이터를 200으로 수정
		list.add(1,500); //
		//list.clear(); -> 리스트가 가진 모든 내용을 제거 (size()를 0으로 만듦)
		
		System.out.println(list.get(2));
		
		
		System.out.println(list);
		System.out.println("길이: "+list.size());
		
		
		
		//for문을 사용하여 list가 가진 모든 데이터를 화면에 출력
		
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
