package ex6_graph;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		
		
		//0~9사이의 난수를 100개 만든다
		//만들어진 난수를 보고 0~9가 각각 몇개씩 포함되어 있는지 그래프화 하시오
		
		//15664646431321879612103151
		// 0의 갯수 : ########## 10
		// 1의 갯수 : ####### 7개
		// ...
		// 9의 갯수 : ######## 8개
		

		String numbers = "";
		
		
		
		
		for (int i = 0; i < 100; i++) {
			numbers += new Random().nextInt(10);
		
			
			
		} //0~9사이의 난수를 100개 
	
		System.out.println(numbers);
		
		int[] arr = new int[10];
		for (int i = 0; i < numbers.length(); i++) {
			
			String s = ""+numbers.charAt(i);
			arr[Integer.parseInt(s)]++;
		}
		
		
		PrintGraph pg = new PrintGraph();
		pg.print(arr);
		
		
		
		
		
		
		
		
	}

}
