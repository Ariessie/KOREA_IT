package ex2_multi_array;

public class Ex4_multi_array {

	public static void main(String[] args) {
		
		
		//2���� �迭 arr�� ��� ��� ���� �հ� ����� ���Ͻÿ�!
		
		int[][] arr = { {1,2,3},  
						{4,5,6,12,14}, 
						{3,56,7,16},
						{20,21} };

		
		int res = 0;
		int num = 0;
		float av = 0;
	
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				res += arr [i][j];	
				num++; //�迭�� ���� ��� ���� ����
			}
			
		}
	
		
		
		System.out.println("��: "+res);
		
		av = (float)res/num;
		
		System.out.printf("���:%.2f ",av);
		
		
		
	}//main

}
