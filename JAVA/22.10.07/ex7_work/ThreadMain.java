package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ThreadTime tt = new ThreadTime();
		int su = 0;

		tt.start();
		outer: while (true) {
			int num = new Random().nextInt(100) + 1;
			int num2 = new Random().nextInt(100) + 1;

			System.out.printf("%d+%d=", num, num2);
			int res = sc.nextInt();

			if (res == num + num2) {
				System.out.println("정답!!");
				su++;
			} else {
				System.out.println("오답...");
			}

			if (su == 5) {
				tt.setTf(false);
				break outer;
			}

		} // while

		
		
		
		

	}

}
