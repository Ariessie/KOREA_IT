package ex4_single_array;

public class Ex1_SingleArray {

	public static void main(String[] args) {
		
		/*
		  #day 6
		   
	 	  [ label ] *Ex1_label_break
		 	: ���� ����� �ݺ������� �����ϴ� break, continue�� �޸�
		 	   �� ���� �� �� �̻��� �ݺ����� ������ �� �ֵ��� �ϴ� Ű����
		  
		   [ �迭 ] 
		 	: '���� �ڷ������� ��Ƶ� �ϳ��� ����'�̴�.
		 	: ȿ������ �ڷ������ ���� �ݵ�� �ʿ�
		 	
		 	�ڿ��� ���ϰ� �����ϰ� �����ϱ� ���� �迭�� ���
		 	1) �迭 ����
		 		int[] arr;
		 	2) �迭 ����
		 		arr = new int [4]; -> �� 4��¥�� �����ε� �� �濡�� ������ �� �� ����
		 	3) �迭 �ʱ�ȭ
		 	 	arr[0] = 100;
		 	
		 	4) �迭�� ����� ������ �ѹ���
		 	int[] arr = new int[4]; 
		 	
		   > arr.length�� index�� ��                                                                          
		 	
		*/
			int su1 = 10;
			int su2 = 20;
			int su3 = 30;
			int su4 = 40;
			
			
			//�迭
			
			int[] arr ;
			arr = new int [4];
			arr[0] = 100;
			//�迭�� �������� �ʴ� index�� ���� �߰��ϰų� ������ �� ����.
			// arr[4] = 100;
			
//			System.out.println(arr[i]); //Ư��  index�� ���� ������ ��� �� �� �ִ�.
		
			for(int i =0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}//for
		
		
	}

}
