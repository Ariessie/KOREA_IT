package ex2_multi_array;

import java.util.Scanner;

public class Ex5_multi_array {

	public static void main(String[] args) {
		// 마방진
		
		Scanner sc = new Scanner(System.in);
		int [][] arr; //마방진의 크기를 결정할 2차원 배열
		
		int num =1; //시작수
		int size = 0; //마방진의 크기
		int y = 0; //행
		int x = 0; //열
		
		System.out.print("홀수: ");
		size = sc.nextInt();
		x = size/2;
		arr = new int[size][size];
		
		while (num <= size*size) {
			
			
			arr[y][x] = num;
			
			if (num % size == 0) {
				y++;
			}else {
				y--;
				x++;
			}//if (1)
			
			if(y < 0) {
				y = size -1;
			}
			if(x >= size) {
				x = 0;
			}
			num++;
			
		}//while
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%02d ",arr[i][j]);
			}//inner
			System.out.println();
		}//outer
		
		

	}

}
