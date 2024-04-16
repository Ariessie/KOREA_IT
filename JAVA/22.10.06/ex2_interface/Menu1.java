package ex2_interface;

public interface Menu1 extends Menu2, Menu3{
	//인터페이스는 직접적인 구현 능력을 가지고 있지 않기 때문에 다중상속이 가능
	
	public String jjajang();
	public String jjambbong();

}
