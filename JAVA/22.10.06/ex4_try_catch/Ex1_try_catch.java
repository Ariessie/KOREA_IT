package ex4_try_catch;

public class Ex1_try_catch {

	public static void main(String[] args) {
		// TryCatch (����ó��)
		// �ڹٿ��� ���α׷� ������ ���� (����, ���� ..)�� �߻��ϸ� �� ��������
		// ���α׷��� ���������� ����ȴ�. �̰��� �ùٸ� �Ǵ������� ���δ�
		// ���������� ������ �߻����� �� �̸� �����ϰų� �ذ��ϰ� �����ؾ� �� ���� ����
		// ����ó���� ���� ���α׷��� ���������� ���Ḧ ���̰� ������ ���� �ڵ带 �ۼ��� �� �ִ�.

		int n = 2;
		int result = 0;
		int[] arr = { 1, 2, 3 };

		try {
			// try ���� �ȿ��� ���ܰ� �߻��ϸ� ���ܹ߻� �������� catch�������� �̵��Ѵ�.
			result = 10 / n;
			arr[3] = 4;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("������ 0���� ���� �� �����ϴ�");
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� index�� �����ϴ�");
		}finally {
			//���� ���οʹ� ������� �������� �ݵ�� ȣ��Ǵ� ����
			System.out.println("finally ����");
		}
		System.out.println("���: " + result);

	}

}
