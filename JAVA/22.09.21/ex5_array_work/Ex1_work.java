package ex5_array_work;

public class Ex1_work {

	public static void main(String[] args) {
		//배열 arr에 담긴 모든 값의 합을 출력하시오
		int[] arr = {10, 20, 30, 40, 50};
		
		
		int sum = 0;
		
		//개선된 for문
		for(int a : arr) {
			sum += a;
		}
		System.out.println("개선된 for문: "+sum);
		
		
		sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
		
			sum += arr[i];
			
		}
		
		
		System.out.println("for문: "+ sum);
		
		
		
		      

	}

}
