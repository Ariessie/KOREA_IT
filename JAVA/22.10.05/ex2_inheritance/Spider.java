package ex2_inheritance;

public class Spider extends Animal {

	String special = "�Ź��� ����";
	
	@Override
	public int getEye() {
		
		return 6;
	}
	
	@Override
	public int getLeg() {
		
		return 8;
	}
	
}
