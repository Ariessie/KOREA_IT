package ex4_constructor;

public class PenMain {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		System.out.println(p.getColor());
		System.out.println(p.getPrice());
		Pen p2 = new Pen();
		System.out.println(p2.getColor());
		System.out.println(p2.getPrice());
		
		Pen p3 = new Pen("±Ý»ö", 25000);
		System.out.println(p3.getColor());
		System.out.println(p3.getPrice());
		

}
}