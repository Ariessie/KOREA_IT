package ex1_control_statement;

public class Ex5_switch {

	public static void main(String[] args) {
		// switch-case ��

		int n = 2;

		switch (n) { // �񱳰�

		case 1: // ���ǰ�
			System.out.println("1. game start");
			break;// switch���� ������ ���� ���´�.

		case 2:
			System.out.println("2. information");
			break;

		case 3:
			System.out.println("3.exit");
			break;

		default:
			//�񱳰��� ���ǰ��� ��ġ���� �ʴ� �ܿ� ȣ��Ǵ� ����
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
			break;

		}

	}// main

}
