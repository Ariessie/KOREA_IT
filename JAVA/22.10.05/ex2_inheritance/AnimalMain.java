package ex2_inheritance;

public class AnimalMain {

	public static void main(String[] args) {

		Elephant ele = new Elephant();
		System.out.println("----ÄÚ³¢¸®----");
		System.out.println("´«: " + ele.getEye());
		System.out.println("´Ù¸®: " + ele.getLeg());
		System.out.println("Æ¯Â¡: " + ele.special);
		System.out.println();
		
		Lion lion = new Lion();
		System.out.println("----»çÀÚ----");
		System.out.println("´«: " + lion.getEye());
		System.out.println("´Ù¸®: " + lion.getLeg());
		System.out.println("Æ¯Â¡: " + lion.special);
		System.out.println();
		
		Rabbit rb = new Rabbit();
		System.out.println("----Åä³¢----");
		System.out.println("´«: " + rb.getEye());
		System.out.println("´Ù¸®: " + rb.getLeg());
		System.out.println("Æ¯Â¡: " + rb.special);
		
		
		Snake sn = new Snake();
		System.out.println("----¹ì----");
		System.out.println("´«: " + sn.getEye());
		System.out.println("´Ù¸®: " + sn.getLeg());
		System.out.println("Æ¯Â¡: " + sn.special);
		System.out.println();
		
		Spider sp = new Spider();
		System.out.println("----°Å¹Ì----");
		System.out.println("´«: " + sp.getEye());
		System.out.println("´Ù¸®: " + sp.getLeg());
		System.out.println("Æ¯Â¡: " + sp.special);
		
		
		
		
	}

}
