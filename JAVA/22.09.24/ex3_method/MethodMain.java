package ex3_method;

public class MethodMain {

	public static void main(String[] args) {
		
		
		MethodTest t1 = new MethodTest();
		t1.test1();
		
		
		int su = 100;
		String res = t1.value(su);
		
		
		
		System.out.println("su: "+su);
		System.out.println(res);
		
		
		
		System.out.println("---------");
		
		int num = t1.value2(su);
		su = t1.value2(su);
		System.out.println("su: "+su);
		
		
		System.out.println("-----------");
		
		char result = t1.select("1");
		
		System.out.println(result);
		
		
		
		
		
	}

}
