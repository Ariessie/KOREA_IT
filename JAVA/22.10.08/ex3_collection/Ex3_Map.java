package ex3_collection;

import java.util.HashMap;


public class Ex3_Map {
public static void main(String[] args) {
	
	/*
	 
	 Map : Ű (key)�� �� (value)�� ��� �ϳ��� �����Ѵ�,.
	 Ű�� ���� ���� �˻��ϹǷ� �������� �����͸� �˻��ϴµ� �־ �ſ� �پ ������ ����
	   Ű���� �ߺ��Ǹ� �������� �߰��� Ű������ value�� ��ü
	 */
	
	HashMap<Integer, Boolean>map = new HashMap<>();
	map.put(1,true);
	map.put(2,false);
	System.out.println(map.size());
	
	boolean res = map.get(2);
	
	HashMap<String, String> map2 = new HashMap<>();
	map2.put("k1", "���� key�� k1");
	map2.put("k1", "hi");	
	map2.put("k2", "���� key�� k2");
	map2.put("k3", "���� key�� k3");
	map2.put("k4", "hi");
	
	map2.remove("k2");
	System.out.println(map2.size());
	System.out.println(map2);
	
	
	//map2�� k3��� �̸��� Ű���� �����ϰ� �ִٸ� true
	if(map2.containsKey("k2")) {
		System.out.println("k2Ű�� �����մϴ�.");
	}

	
	
	//map2�� hi��� value���� �����Ѵٸ� true
	if(map2.containsValue("hi")) {
		
		System.out.println("hi���� �����մϴ�.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// main
}
