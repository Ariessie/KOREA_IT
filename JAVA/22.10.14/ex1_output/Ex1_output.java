package ex1_output;

import java.io.PrintStream;

public class Ex1_output {

	public static void main(String[] args) {
		
		//PrintStream�� OutputStream�� ��ǥ���� �ڽ�Ŭ���� �� �ϳ�
		//�ܼ� â�� �����͸� ����ϵ��� �ϴ� Ŭ����
		
		PrintStream ps =  null;
		ps = System.out;
		
		
		
		int first = 'A';
		int second = 'B';
		
		ps.write(first);
		ps.write(second);
		ps.write(10);
		
		
		ps.close();
		
		
		
	}

}
