package ex2_single_for;

public class Ex1_for {

	public static void main(String[] args) {
		/*
		 #day 4
		 
		  [ formatter�� �ڷ��� Ÿ�� ]
			%d : ���� Ÿ��
			%c : ���� Ÿ��
			%f : �Ǽ�Ÿ��
			%s : ���ڿ� Ÿ��
		 
		 
		  [ for�� ] *Ex1_for
		   : Ư�� ����� ���ϴ� ��ŭ �ݺ������� �����ϱ� ���� �ݺ���
		   : for�� �ȿ����� ��� ������ ���� ������ ���� �� �ִ�.
		 	for( �ʱ��; ���ǽ�; ������;) { ���ǽ��� ���϶� ����Ǵ� ���� }
		  
		  i�� ���� Ư�� ���� �ȿ��� �ʱ�ȭ�Ǿ� ������� ������ ��������
		  
		  [ ����for�� ] *Ex1_multifor
		  	: for�� �ȿ� for���� ���ԵǾ� �ִ� ���
		  	
		  
		 */
		int n = 20; //��������
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			n = 30;
		} //for
		
		System.out.println("---");
		for ( int i = 10; i > 0; i-- ) {
			System.out.println(i);
		} //for2

		int a = 1;
		for (a=0; a<=3;a++) {
			System.out.println(a);
		}
		
		
//		for(;a>=0;a--)
//		System.out.println(a);
//		
//		for(;;) {
//		System.out.println(a);
//		}
//		
		
		//���� 1���� 100���� �ݺ��ϴ� for���� ����� �� �ȿ��� 3�� ����� ����Ͻÿ�
		
     	System.out.println("-----");
		
		for (int i = 1; i <= 100; i++) {
				if(i % 3 == 0 ) {
			System.out.println(i);
				} //if
				
				
			}//for
			
			
			
		
		
		
	}

}
