package ex3_break;

public class Ex1_break {

	public static void main(String[] args) {
		
		for (int  i= 1; i <= 2; i++) {
			
			for (int j = 1; j <= 4 ;j++ ) {
				
				if (j % 2 == 0) {
					//�Ʒ����� ��� �ڵ带 �����ϰ� ���� ����� �ݺ����� ������ Ż��
					break;
					//break�Ʒ����� � �ڵ嵵 �߰��� �� ����.
				}//if
				System.out.print(j+" ");
			}//inner
			System.out.println();
		}//outer
		
		

	}

}
