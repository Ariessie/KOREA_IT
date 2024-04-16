package ex2_interface;

public class Kitchen implements Menu1 {
	//인터페잇그는 실행능력이 없기 때문에 다중 구현이 가능

	@Override
	public String jjajang() {
		
		return "중면+춘장";
	}
	
	@Override
	public String jjambbong() {
		
		return "홍합+꼬막+...";
	}


	@Override
	public String boggembab() {
		return "이천쌀 + 짜장소스";
	}


	@Override
	public String tangsuyuck() {
		
		return "돼지고기 등등...";
	}
	
	
	

}
