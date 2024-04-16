package ex7_work;

import java.util.Random;

public class Quiz {

	public static void main(String[] args) {
		// 
		
		String[] strArr = {"CHANGE", "APPLE", "DOCTOR"};
		
		int s = new Random().nextInt(3);
		
		System.out.println(strArr[s]);
		
		int s2 = new Random().nextInt(strArr[s].length());
		
		for (int i = 0; i < strArr[s].length(); i++) {
			
		char[] arr = new char[strArr[s].length()];
		arr[s2] = strArr[s].charAt(i);
		
	
		}
		
		
		
		
		
		
//		0~5 -> 5-0+1
//	±Ê¿Ã : 5 ,  4
		
		
		
		
		

	}

}
