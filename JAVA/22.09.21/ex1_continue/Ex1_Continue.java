package ex1_continue;

public class Ex1_Continue {

	public static void main(String[] args) {
		
		
		int n = 0;
		while (n <10) {
		
			n++;
			if(n %2 ==0 ) {
				// while문 안에서 동작하는 continue는 while문의 조건식으로 이동한다.
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
				System.out.println("아래줄 무시");
				continue; // 반복문 내에서는 switch문도 continue키워드를 사용할 수 있다.
				
			case 2:
				System.out.println("아래줄 무시 2");
				//반복문 안에서의 switch가 가진 continue는 
				// switch를 포장하고 있는 반복문의 증감식이나 조건식으로 이동한다.
				
				break;
			}//switch
			System.out.println(num);
		}//while 
		
		
		
		
	}

}
