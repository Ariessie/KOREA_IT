package ex1_control_statement;

public class Ex3_if_else {

	public static void main(String[] args) {
		// if-els

		/*
		 * 변수 age에 나이를 대입하고
		 * 30세 이상이면, '드실만큼 드셨군요'를
		 * 그렇지 않으면 '조금더 드셔도 됨'을 출력하는 코드를 작성
		 * 
		 * 
		 */
		
		int age = 21;
		if(age >= 30) {
			System.out.println("드실만큼 드셨군요");
		}else {
			System.out.println("조금 더 드셔도 됨");
		}
		
		//위 코드를 삼항연산자로 변환하시오.
		System.out.println("-----------");
	   
		age = 30;
		String str = age >= 30 ? "드실만큼 드셨군요" : "조금 더 드셔도 됨";
		System.out.println(str);
		
				
	}

}
