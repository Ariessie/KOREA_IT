package ex2_io;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\java_0914_yjw");
	
		if (f.isDirectory()) { //f의 접근경로가 폴더형식이라면...
			
			//f의 하위 요소들을 File클래스 형식으로 받는다
			File[] ar = f.listFiles();
			
			for (int i = 0; i < ar.length; i++) {
				if (ar[i].isDirectory()) {
					System.out.println(ar[i].getName());
					
				}
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
