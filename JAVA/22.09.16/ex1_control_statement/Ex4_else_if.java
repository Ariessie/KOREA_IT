package ex1_control_statement;

public class Ex4_else_if {

	public static void main(String[] args) {
		// 다중 이프문
		
		int num = 49;
		String str = "";
		
		if(num >= 90) {
			str = "A";
		} else if(num >= 80){
			str = "B";
		} else if(num >= 70){
			str = "C";	
		} else if(num >= 60){
			str = "D";	
		} else{
			
			str = "F";
		} // if문
		
		System.out.println(str);

	}//main

}
