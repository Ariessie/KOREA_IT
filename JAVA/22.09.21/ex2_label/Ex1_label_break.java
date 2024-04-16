package ex2_label;

public class Ex1_label_break {

	public static void main(String[] args) {
		
		
		
		for (int i = 1; i <2 ; i++) {
			outer : for (int j = 1; j <5 ; j++) {
				
				if(j%2==0) {
					break outer;
				}
				System.out.print(j+" ");
				
				
			}//inner
			System.out.println();
		}//outer
		

	}// main

}
