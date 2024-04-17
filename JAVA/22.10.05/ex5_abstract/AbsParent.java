package ex5_abstract;

public abstract class AbsParent {
	//추상클래스는 추상메서드를 한개 이상 가지고 있는 클래스를 의미
	//추상클래스는 역시 abstract키워드를 사용한다.

	int value = 10;
	String str = "안녕";

	//추상메소드
	//추상메소드는 body가 없다. (abstract 키워드를 통해 생성한다)
	//몸체가 없는 추상메서드는 '미완성된 개념'이라고 하는데,
	//이렇게 미 완성된 메서드를 자식이 물려받아 완성시키도록 하는 것이 조건이 된다.
    abstract public void setValue(int n);

	
	
	
}
