package ex4_constructor;

public class Pen {

	private String color ;
	private int price ;
	
	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public Pen() {
		color="black";
		price=300;
	}

	public Pen(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	
}
