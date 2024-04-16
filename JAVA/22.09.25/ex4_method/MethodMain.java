package ex4_method;

public class MethodMain {

	public static void main(String[] args) {
	
		
		int[] arr = {1,2,3};
		
		
		MethodTest mt = new MethodTest();
		
		mt.test(arr);
		
		System.out.println("main¿¡¼­ ½ÇÇàµÊ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}

}
