package ex1_continue;

public class Ex1_Continue {

	public static void main(String[] args) {
		
		
		int n = 0;
		while (n <10) {
		
			n++;
			if(n %2 ==0 ) {
				// while�� �ȿ��� �����ϴ� continue�� while���� ���ǽ����� �̵��Ѵ�.
				continue;	
			}//if
			System.out.println(n);
		}//while
		
		System.out.println("-------------");
		
		int num = 0;
		while (num < 5) {
			num ++;
			
			switch(num) {
			
			case 1: 
				System.out.println("�Ʒ��� ����");
				continue; // �ݺ��� �������� switch���� continueŰ���带 ����� �� �ִ�.
				
			case 2:
				System.out.println("�Ʒ��� ���� 2");
				//�ݺ��� �ȿ����� switch�� ���� continue�� 
				// switch�� �����ϰ� �ִ� �ݺ����� �������̳� ���ǽ����� �̵��Ѵ�.
				
				break;
			}//switch
			System.out.println(num);
		}//while 
		
		
		
		
	}

}
