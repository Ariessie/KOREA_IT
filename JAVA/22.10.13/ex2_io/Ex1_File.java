package ex2_io;

import java.io.File;

public class Ex1_File {

	public static void main(String[] args) {
		/*
		  [ IO (Input, Output) ]
		   IO�� ����� ��Ʈ���� �ǹ�
		      ��Ʈ���̶�, �����͸� ����� �ϱ� ���� ������ ���
		   JVM���� �ܼ��� �����͸� �о� �´ٴ���, �ݴ�� JVM�� �����͸� �ֿܼ� ���� 
		      �۾����� �����ϰ� �� �ش�.
		  
		  ���� Ŭ������ ������ path��� 
		  
		 */
		
		String path = "C:\\java_0914_yjw\\test.txt";
		File f = new File(path);
		
		if (f.isFile()) { //fileŬ������ path��ΰ� ���������� ���
			System.out.println(f.length()+ "byte");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
