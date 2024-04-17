package ex4_super;

public class Child extends Parent {
	//super : 부모클래스
	
	
	public Child() {
		super(10);
		
		System.out.println("자식클래스 생성자");
	}
	
	@Override
	public int getResult(int n1, int n2) {
		
		//super.getResult(n1, n2);//부모클래스의 getResult()메서드 호출
	
	return n1+n2;
	
	}
	
	public void setNum(int num) {
		super.num=num; //super.num : 부모클래스의 num변수
	}
	
	
}
