package ex1_interface;

public class TestChild implements TestInter {
//인터페이스를 구현하려면 implements 키워드를 사용한다.
	//구현한 인터페이스의 추상메서드를 반드시 오버라이딩 해둬야 한다.
	
	
	@Override
	public int getValue() {
	
		return 10;
	}

}
