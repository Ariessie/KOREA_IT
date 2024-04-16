package ex2_overload;

public class Bread {

	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}

	public void makeBread(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 빵을 %d개 만들었음\n", num);
	}

	public void makeBread(String type, int num) {

		for (int i = 0; i < num; i++) {
			System.out.printf("%s을 만들었습니다.\n", type);
		}
		System.out.printf("요청하신 %s을 %d개 만들었습니다.\n",type,num);
	}

}
