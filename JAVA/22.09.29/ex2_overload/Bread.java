package ex2_overload;

public class Bread {

	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}

	public void makeBread(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.printf("��û�Ͻ� ���� %d�� �������\n", num);
	}

	public void makeBread(String type, int num) {

		for (int i = 0; i < num; i++) {
			System.out.printf("%s�� ��������ϴ�.\n", type);
		}
		System.out.printf("��û�Ͻ� %s�� %d�� ��������ϴ�.\n",type,num);
	}

}
