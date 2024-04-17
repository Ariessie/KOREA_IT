package ex3_override;

public class CalMinus extends Calculator {

	private int result = 0;
	@Override
	public void getResult(int a, int b) {
	
		result = a-b;
		System.out.println(result);
		
		
		
	}
}
