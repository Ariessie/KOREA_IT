package ex1_control_statement;

public class Ex6_switch {

	public static void main(String[] args) {
		// switch

		char ch = 'C';

		switch (ch) {
		case 'A': // ���ǰ�
			System.out.println("90~100");
			break;
		case 'B': // ���ǰ�
			System.out.println("80~89");
			break;
		case 'C': // ���ǰ�
			System.out.println("70~79");
			break;
		case 'D': // ���ǰ�
			System.out.println("60~69");
			break;
		case 'F': // ���ǰ�
			System.out.println("59�� ����");
			break;

		default:
			System.out.println("������ �ùٸ��� �Էµ��� �ʾҽ��ϴ�.");
			break;

		}

	}

}
