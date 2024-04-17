package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInput {

	public static void main(String[] args) {
		
		
		
		String path = "C:\\java_0914_yjw\\test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if (f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				fis.read(read); //fis가 읽어온 내용을 read배열에 1byte씩 저장
				
				//read라는 바이트 배열을 문자열 result로 변경하는 코드
				String result = new String(read);
				System.out.println(result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				try {
					//finally 영역 안에서 스트림을 닫아주면 
					//예외 유뮤와 상관없이 스트림을 닫을 수 있기 때문에 유용
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		
		

	}

}
