package ex3_updown;

import java.util.Random;

public class GameClass {

	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
	private boolean result = false;

	public boolean check(int n) {
		count++;
		if (n < random)
			System.out.println("UP");
		else if (n > random)
			System.out.println("DOWN");
		else {
			System.out.println(count + "회 만에 정답");
			result = true;
		} // up인지 down인지 정답인지 판단.

		return result;

	}

}
