package ex5_abstract;

public class AbsChild extends AbsParent {

	//추상 클래스를 상속받은 자식클래스는 
	//부모가 가진 추상메서드를 반드시 오버라이딩 해야 함
	//추상클래스를 상속받은 자식은 부모의 미완성 메서드를 완성시키도록 조건부 상속
	
	@Override
	public void setValue(int n) {
		value = n;
		
	}

}
