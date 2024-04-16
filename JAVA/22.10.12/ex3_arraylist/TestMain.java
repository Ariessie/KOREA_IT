package ex3_arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
	
		String[] arr = {"apple", "banana", "orange", "grape", "lemon"};
		
		ArrayList<String> list = new ArrayList<>();
		Test t = new Test();
		t.start();
		
		int rnd = new Random().nextInt(arr.length);
		list.add(arr[rnd]);
		
		
		System.out.println(list);
		
		
		
		
		

	}

}
