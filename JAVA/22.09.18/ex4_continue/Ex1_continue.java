package ex4_continue;

public class Ex1_continue {
	
	//continue��
	//for�� �ȿ��� �����ϴ� continue���� �⺻������ ���� ����� for���� ���������� ����.

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 2; i++) {
			
			
			for (int j = 1; j <= 4; ) {
				
				if (j %2 ==0 ) {
					continue;
					//continue�� �ٷ� �Ʒ����� � �ڵ嵵 �������� �ʴ´�.
				}//if
				System.out.print(j + " ");
				j++;
				
			} // inner
			
			System.out.println();
		} // outer

	}// main

}
