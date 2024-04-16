package ex3_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_Set {

	public static void main(String[] args) {
		/*
		 * 컬랙션 프레임워크 데이터 그룹을 다루고 표현하기 위한 단일화된 구조 [ 컬렉션의 종류 ] List, Set, Map
		 * 
		 * Set : java.util패키지에 존재하는 인터페이스 특정 코드에서 중복된 값을 허용하면 안되는 경우에 사용
		 * 
		 * Set을 구현하는 대표적인 자식클래스들 
		 * 
		 * HashSet : 정렬 안됨.
		 * 
		 * TreeSet :
		 * 
		 * 
		 */

		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(3);
		hs1.add(3);
		hs1.add(2);
		hs1.add(1);
//		hs1.remove(3);
		System.out.println(hs1.size());
		System.out.println(hs1);
		
		System.out.println("----------");
		
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		while (true) {
			int r = new Random().nextInt(45)+1;
			lotto.add(r);
			
			if (lotto.size()==6) {
				break;
			}
			
		}
		System.out.println(lotto);
		
		System.out.println("-----------------------");
		
		
		//제너릭 타입을 String으로 지정
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("홍길동");
		hs2.add("정용훈");
		hs2.add("송강호");
		System.out.println(hs2);
		
		System.out.println("---------------");

		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		while(true) {
			int v = new Random().nextInt(45)+1;
			ts1.add(v);
			
			if (ts1.size() == 6) {
				break;
			}
			
		}
		System.out.println(ts1);
		
		
		
		TreeSet<String> name = new TreeSet<String>();
		name.add("김혜자");
		name.add("송강호");
		name.add("마동석");
		System.out.println(name);
		
		
		
		
		
		
		

	}

}
