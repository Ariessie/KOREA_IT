package ex3_multi_for;

public class Ex1_multifor {

	public static void main(String[] args) {
		

		for (int i = 1; i<=2; i++) { //y축(행)
			
			for (int j =1; j<= 3; j++) {
				System.out.print(j+" "); //x축(열)
			}//inner
			
			System.out.println();//줄바꿈
			
		}//outer
		
		
		for (int i =1; i<=3;i++) {
			
			
			for (int j =1; j<=5;j++) {
				System.out.print(j+" ");
			}//inner
			
			
			System.out.println();
		}//outer
		
		
		
		
		
		
		
	}//for

}
