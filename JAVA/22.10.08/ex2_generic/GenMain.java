package ex2_generic;

public class GenMain {

	public static void main(String[] args) {
	
		
		GenTest<String> v1 = new GenTest<String>(); 
		v1.setValue("String 데이터");
		String s = v1.getValue();
		
		System.out.println(s);
		
		
		
		//제너릭타입은 int, char등 기본자료형을 지정할 수 없다.
		//그러므로 반드시 클래스 형식으로 지정해야 제너릭으로 동작 가능
		
		GenTest<Integer> v2 = new GenTest<Integer>();
		
		v2.setValue(100);
		int n = v2.getValue();
		
		GenTest<Character> v3 = new GenTest<Character>();
		v3.setValue('a');
		System.out.println(v3.getValue());
		
		GenTest<Float> v4 = new GenTest<Float>();
		v4.setValue(3.15f);
		
		
		
	}

}
