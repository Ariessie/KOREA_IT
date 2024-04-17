package ex2_inheritance;

public class Snake extends Animal {

	String special = "혀가 길다";
	
	//메서드의 오버라이딩
	//메서드의 재정의
	
	@Override
	public int getLeg() {
		
		return 0;
	}
	
}
