package ex6_graph;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		
		
		//0~9������ ������ 100�� �����
		//������� ������ ���� 0~9�� ���� ��� ���ԵǾ� �ִ��� �׷���ȭ �Ͻÿ�
		
		//15664646431321879612103151
		// 0�� ���� : ########## 10
		// 1�� ���� : ####### 7��
		// ...
		// 9�� ���� : ######## 8��
		

		String numbers = "";
		
		
		
		
		for (int i = 0; i < 100; i++) {
			numbers += new Random().nextInt(10);
		
			
			
		} //0~9������ ������ 100�� 
	
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
