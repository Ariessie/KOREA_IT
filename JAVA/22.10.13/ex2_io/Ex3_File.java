package ex2_io;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\java_0914_yjw");
	
		if (f.isDirectory()) { //f�� ���ٰ�ΰ� ���������̶��...
			
			//f�� ���� ��ҵ��� FileŬ���� �������� �޴´�
			File[] ar = f.listFiles();
			
			for (int i = 0; i < ar.length; i++) {
				if (ar[i].isDirectory()) {
					System.out.println(ar[i].getName());
					
				}
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
