package ex1_random;

import java.util.Random;

public class Ex1_random {

	public static void main(String[] args) {
		
		//1~5������ ����
		// new Random().nextInt(��������)+���ۼ�;
		// new Random().nextInt(ū�� - ������ +1)+���ۼ�;
//		int num = new Random().nextInt(5)+1;
//		System.out.println(num);
		
		//������ ���ĺ� �빮�ڵ� �� �ϳ��� �������
		
		int alpha = new Random().nextInt('Z'-'A'+1)+'A';
		
		
		System.out.println("���: "+(char)alpha);
		
	}

}
