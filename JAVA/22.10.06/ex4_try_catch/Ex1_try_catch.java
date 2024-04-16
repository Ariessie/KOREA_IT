package ex4_try_catch;

public class Ex1_try_catch {

	public static void main(String[] args) {
		// TryCatch (예외처리)
		// 자바에서 프로그램 실행중 예외 (오류, 에러 ..)가 발생하면 그 시점에서
		// 프로그램이 강제적으로 종료된다. 이것은 올바른 판단이지만 때로는
		// 예측가능한 오류가 발생했을 때 이를 무시하거나 해결하고 진행해야 할 때가 있음
		// 예외처리를 통해 프로그램의 비정상적인 종료를 줄이고 오류가 없는 코드를 작성할 수 있다.

		int n = 2;
		int result = 0;
		int[] arr = { 1, 2, 3 };

		try {
			// try 영역 안에서 예외가 발생하면 예외발생 시점에서 catch영역으로 이동한다.
			result = 10 / n;
			arr[3] = 4;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("정수는 0으로 나눌 수 없습니다");
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 index가 없습니다");
		}finally {
			//예외 여부와는 상관없이 마지막에 반드시 호출되는 영역
			System.out.println("finally 영역");
		}
		System.out.println("결과: " + result);

	}

}
