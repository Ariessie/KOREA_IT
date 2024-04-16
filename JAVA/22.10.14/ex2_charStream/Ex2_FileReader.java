package ex2_charStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {

	public static void main(String[] args) {
		// test.txt를 char스트림으로 읽어온 후
		//읽어온 데이터에 알파벳 대문자와 소문자가 각각 몇개 있는지 출력
		
		FileReader fos = null;
		
		try {
			
			fos = new FileReader("C:\\\\java_0914_yjw\\\\test.txt");
			int read = -1;
			
			int upper = 0;
			int lower = 0;
			
			while ((read = fos.read()) != -1) {
				
				if (read >= 'A' && read <= 'Z') {
					upper++;
				}
				
				if (read >= 'a' && read <= 'z') {
					lower++;
				}
				
			}
		
			System.out.println("대문자: "+upper);
			System.out.println("소문자: "+lower);	
			
		} catch (Exception e) {
			
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	
		
	}

}
