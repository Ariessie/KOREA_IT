package ex2_charStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader { //char 기반 스트림

	public static void main(String[] args) {
	
		
		FileReader fr = null;
		String path = "C:\\java_0914_yjw\\test.txt";
		File f = new File(path);
		
//		int a = 50504;
//		System.out.println((char)a);
		
		if (f.exists()) {
			
			try {
				
				fr = new FileReader(f);
				int read = -1;
				
				//char기반의 스트림인 FileReader는
				//read()를 통해 데이터를 읽어올 때 2byte단위로 가지고 온다
				//문자를 읽는데 유용
				
				while ((read = fr.read())!= -1) {
				System.out.print((char)read);	
				
				}
				
				
				
				
			} catch (Exception e) {
				
				
			}//try_catch
			finally {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
