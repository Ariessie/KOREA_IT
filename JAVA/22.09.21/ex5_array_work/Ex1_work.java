package ex5_array_work;

public class Ex1_work {

	public static void main(String[] args) {
		//�迭 arr�� ��� ��� ���� ���� ����Ͻÿ�
		int[] arr = {10, 20, 30, 40, 50};
		
		
		int sum = 0;
		
		//������ for��
		for(int a : arr) {
			sum += a;
		}
		System.out.println("������ for��: "+sum);
		
		
		sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
		
			sum += arr[i];
			
		}
		
		
		System.out.println("for��: "+ sum);
		
		
		
		      

	}

}