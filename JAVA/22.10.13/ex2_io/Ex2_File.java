package ex2_io;

import java.io.File;

public class Ex2_File {

	public static void main(String[] args) {
	
		
		//  ���� Ŭ������ ������ path��� 
		String path = "C:\\java_0914_yjw";
		File f = new File(path);
		
		if(!f.isFile()) { //f.isDirectory()
			//FileŬ������ ������ ��ΰ� ���� �� ���
			
			//f.list() : f�� ��λ� �ִ� ��������� �̸��� �����´�
			String[] names = f.list();
			
			
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
			
		}
		
		
		
		
		
	}

}
