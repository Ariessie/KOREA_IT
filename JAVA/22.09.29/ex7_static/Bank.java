package ex7_static;

public class Bank {

	// staitc ������ �޼���� ��ü�� �ƹ��� ���� �����ص� �޸𸮻� �� �Ѱ��� �������

	private String point;// ������ġ
	private String tel; // �����ȣ
	static float interest;// ������

	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10;
	}

	public void getInfo() {
		System.out.println("����: " + point);
		System.out.println("��ȭ: " + tel);
		System.out.println("������: "+interest+"%");
		System.out.println("----------------");
	}

}
