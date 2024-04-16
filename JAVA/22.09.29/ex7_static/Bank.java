package ex7_static;

public class Bank {

	// staitc 변수나 메서드는 객체를 아무리 많이 생성해도 메모리상에 딱 한개만 만들어짐

	private String point;// 은행위치
	private String tel; // 은행번호
	static float interest;// 이자율

	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10;
	}

	public void getInfo() {
		System.out.println("지점: " + point);
		System.out.println("전화: " + tel);
		System.out.println("이자율: "+interest+"%");
		System.out.println("----------------");
	}

}
