package ex2_operator;

public class Ex4_Operator {

	public static void main(String[] args) {
		// ��Ʈ������
		
		//10���� -> 2������ �ٲ㼭 ����ؾ� �Ѵ�.
		int a = 10;  //1010 
		int b = 7;   //0111
		int c = a&b; //0010 --> 2
		//�Ѵ� 1�� ��쿡�� 1
		//����
		System.out.println("���� : "+c);
		
		
		c = a|b;
		//����
		System.out.println("����: "+c); //
		
		c=a^b;
		//��Ÿ��or
		System.out.println("xor: "+c); //1101
		
		System.out.println("-------------");
		//����Ʈ ������
		int n = 12; //1100
		int res = n >> 2;
		System.out.println(res);
		
		char ch = 'F'; //1000110
		char ch_res = (char)(ch >> 1); //0100011
		System.out.println(ch_res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
