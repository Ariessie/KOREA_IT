package ex4_vending;

public class Can {// 음료수의 속성

	private String name;
	private int price;

	
	public Can() {

	} //생성자
	
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}

	

	public Can(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

}
