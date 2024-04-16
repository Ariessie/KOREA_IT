package ex1_control_statement;

public class Ex2_if_else {

	public static void main(String[] args) {
		//if-else 문
		
		int n = 49;
		String str = "";
		
		if(n++ >= 50) {
			str = "n은 50이상의 수"; 
		} else{
			//if의 조건식이 거짓일 때 반드시 호출되는 영역
			str = "n은 50미만의 수";
		}
		System.out.println(str);
		System.out.println("---------");
		
		char gender = '남';
		
		if (gender == '남') {
			System.out.println("수염이 난다.");
		}else {
			System.out.println("수염이 안남");
		}
		
		
		
		
		
	}

}
