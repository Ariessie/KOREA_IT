package ex3_break;

public class Ex1_break {

	public static void main(String[] args) {
		
		for (int  i= 1; i <= 2; i++) {
			
			for (int j = 1; j <= 4 ;j++ ) {
				
				if (j % 2 == 0) {
					//아래쪽의 모든 코드를 무시하고 가장 가까운 반복문을 강제로 탈출
					break;
					//break아래에는 어떤 코드도 추가될 수 없다.
				}//if
				System.out.print(j+" ");
			}//inner
			System.out.println();
		}//outer
		
		

	}

}
