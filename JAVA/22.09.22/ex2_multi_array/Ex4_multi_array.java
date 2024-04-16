package ex2_multi_array;

public class Ex4_multi_array {

	public static void main(String[] args) {
		
		
		//2차원 배열 arr에 담긴 모든 값의 합과 편균을 구하시오!
		
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
				num++; //배열이 가진 모든 방의 갯수
			}
			
		}
	
		
		
		System.out.println("합: "+res);
		
		av = (float)res/num;
		
		System.out.printf("평균:%.2f ",av);
		
		
		
	}//main

}
