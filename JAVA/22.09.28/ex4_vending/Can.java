package ex4_vending;

public class Can {// ������� �Ӽ�

	private String name;
	private int price;

	
	public Can() {

	} //������
	
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
