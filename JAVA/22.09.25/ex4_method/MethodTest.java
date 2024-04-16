package ex4_method;

public class MethodTest {
	
	public void test (int[] ar) {
		
		ar[0]=5;
		System.out.println("test() 메서드에서 호출됨");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("-------------------");
	}
	
	
	

}
