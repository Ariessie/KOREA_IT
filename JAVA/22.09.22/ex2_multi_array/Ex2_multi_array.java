package ex2_multi_array;

public class Ex2_multi_array {

	public static void main(String[] args) {
		
		
		int[][] num = new int [2][];
		num[0] = new int[3];
		num[1] = new int[2];
		
		num[0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;

		num[1][0] = 4;
		num[1][1] = 5;

		
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				
				System.out.print(num[i][j]+" ");
			}//inner
			System.out.println();
		}//outer
		
		
		

	}

}
