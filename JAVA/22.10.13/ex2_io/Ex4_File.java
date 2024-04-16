package ex2_io;

import java.io.File;

public class Ex4_File {

	public static void main(String[] args) {
	
		
		String path = "C:\\java_0914_yjw\\abc ";
		File f1 = new File(path);
		
		if (!f1.exists()) {
			//f1.exists() : f1의 접근 경로가 물리적으로 존재한다면 true
			System.out.println("폴더를 생성합니다");
			f1.mkdirs();//폴더 생성 (단수는 폴더 하나만 생성 가능)
			
		}else {
			System.out.println("이미 존재하는 폴더임");
		}
		
		
		
	}

}
