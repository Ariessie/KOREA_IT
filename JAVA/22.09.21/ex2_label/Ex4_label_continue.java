package ex2_label;

public class Ex4_label_continue {

	public static void main(String[] args) {

		int n = 0;
		out: while (n < 10) {

			n++;

			switch (n) {
			case 2:
			case 4:
				System.out.println("switch ½ÇÇà");
//				continue out;
				break out;
				
			}

			System.out.println(n);
		} // while

	}

}
