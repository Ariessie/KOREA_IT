package ex2_multi_array;

import java.util.Scanner;

public class Ex5_multi_array {

	public static void main(String[] args) {
		// ������
		
		Scanner sc = new Scanner(System.in);
		int [][] arr; //�������� ũ�⸦ ������ 2���� �迭
		
		int num =1; //���ۼ�
		int size = 0; //�������� ũ��
		int y = 0; //��
		int x = 0; //��
		
		System.out.print("Ȧ��: ");
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
