package ex3_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2_Iterator {

	public static void main(String[] args) {
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(45);
		set.add(30);
		set.add(15);
		set.add(7);
		
		System.out.println(set);
		//set구조는 특정 인덱스로 접근이 불가능하기 때문에
		//내용을 얻어오기 위해서는 Iterator라는 반복자를 사용해야 한다.
		
		Iterator<Integer> it = set.iterator();
		
		int[] arr = new int[set.size()];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = it.next();
			System.out.print(arr[i]+" ");
			
		}//for
		
		
		System.out.println("\n"+arr[2]);
		
		
		
		
		
		
	}//main

}
