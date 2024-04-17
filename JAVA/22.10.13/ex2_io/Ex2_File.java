package ex2_io;

import java.io.File;

public class Ex2_File {

	public static void main(String[] args) {
	
		
		//  파일 클래스가 접근할 path경로 
		String path = "C:\\java_0914_yjw";
		File f = new File(path);
		
		if(!f.isFile()) { //f.isDirectory()
			//File클래스가 접근한 경로가 폴더 인 경우
			
			//f.list() : f의 경로상에 있는 하위요소의 이름만 가져온다
			String[] names = f.list();
			
			
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
			
		}
		
		
		
		
		
	}

}
