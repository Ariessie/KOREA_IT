package ex2_while;

public class Ex1_while {

	public static void main(String[] args) {
		/*
		 
		  #day 5 
		  
		   [ while�� ]
		   : ������ ������ ���� �ݺ��� (�� �� �� ó��)
		   	 while(���ǽ�){ ���ǽ��� ���� �� ����Ǵ� ���� }
		  
		 	���ѹݺ� �ڵ� : ���ǽ��� ������ true�̱� ������ ���ѹݺ� �ȴ�.
		 	while (true) {  }
		  
		   [ do-while�� ] *Ex2_do_while
		  	: �� ó��, �� ��
		  	: ��� �� �����ϰ� ;���� ������.
		  	
		  	
		  	[ break ] *Ex1_break
		  	: �ݺ��� ������ ���������� ���� ����� �ݺ����� ���������� ���� Ű����
		  	: break �ٷ� �Ʒ����� � �ڵ嵵 �������� �ʴ´�.
		  	
		  	[continue��] *Ex1_continue
		  	 : �ݺ��� ������ Ư�� ������ �ǳʶ� �� ����ϴ� Ű����
		  	 : continue�� �ٷ� �Ʒ����� � �ڵ嵵 �������� �ʴ´�.
		  	 : for�� �ȿ��� �����ϴ� continue���� �⺻������ ���� ����� for���� ���������� ����.
			 : for���� �������� ���ٸ�, continue�� �������� �����ϰ� ���ǽ����� ����.
		 
		 */

		
		int num = 1;
		while(num <= 5) {
			System.out.println(num++);
			
		}
		
		
	}

}
