package ex1_output;

import java.io.PrintStream;

public class Ex1_output {

	public static void main(String[] args) {
		
		//PrintStream은 OutputStream의 대표적인 자식클래스 중 하나
		//콘솔 창의 데이터를 출력하도록 하는 클래스
		
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
