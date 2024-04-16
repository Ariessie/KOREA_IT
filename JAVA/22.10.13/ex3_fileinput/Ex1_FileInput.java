package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {

	public static void main(String[] args) {
		
		
		/*
		 
		 스트림의 종류
		 ...Stream : byte기반의 스트림
		 ...Reader, ...Writer: char기반의 스트림
		  
		  
		  
		  
		  
		  
		 */
		
		
		
		
		String path = "C:\\java_0914_yjw\\test.txt";
		File f = new File(path);
		
		if (f.exists()) {
			
			//파일과 연결된 입력스트림 생성
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				//스트림은 read()를 통해 byte 단위로 아스키 코드값을 읽어오는데,
				//반복을 수행하다가 더이상 읽을 것이 없을 대, -1을 가져온다
				//파일의 끝인 (EOF)-1을 만나면 반복문이 종료된다. 
				int code = -1;
				while ((code = fis.read()) != -1) {
				
					System.out.print((char)code);
				}
				
				//읽어오는 작업이 마무리되면 반드시 스트림을 닫아준다
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		

	}//main

}
