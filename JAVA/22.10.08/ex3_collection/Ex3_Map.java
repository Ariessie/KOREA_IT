package ex3_collection;

import java.util.HashMap;


public class Ex3_Map {
public static void main(String[] args) {
	
	/*
	 
	 Map : 키 (key)와 값 (value)을 묶어서 하나로 저장한다,.
	 키를 통해 값을 검색하므로 많은양의 데이터를 검색하는데 있어서 매우 뛰어난 성능을 발휘
	   키값이 중복되면 마지막에 추가한 키값으로 value가 대체
	 */
	
	HashMap<Integer, Boolean>map = new HashMap<>();
	map.put(1,true);
	map.put(2,false);
	System.out.println(map.size());
	
	boolean res = map.get(2);
	
	HashMap<String, String> map2 = new HashMap<>();
	map2.put("k1", "나의 key는 k1");
	map2.put("k1", "hi");	
	map2.put("k2", "나의 key는 k2");
	map2.put("k3", "나의 key는 k3");
	map2.put("k4", "hi");
	
	map2.remove("k2");
	System.out.println(map2.size());
	System.out.println(map2);
	
	
	//map2가 k3라는 이름의 키값을 포함하고 있다면 true
	if(map2.containsKey("k2")) {
		System.out.println("k2키가 존재합니다.");
	}

	
	
	//map2에 hi라는 value값이 존재한다면 true
	if(map2.containsValue("hi")) {
		
		System.out.println("hi값이 존재합니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// main
}
