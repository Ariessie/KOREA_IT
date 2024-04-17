package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex3_FileInput {

	public static void main(String[] args) {
		// file.txt의 내용을 읽어 회문수인지 아닌지를 판단하시오

		String path = "C:\\java_0914_yjw\\file.txt";
		
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		FileInputStream fis = null;
		String result = "";

		String rev="";
		
		if (f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				fis.read(read); //원본데이터를 읽어서 read배열에 담는다
				result = new String(read);//read배열의 값을 문자열로 변경
				for (int i = result.length()-1; i >=0 ; i--) {
					rev += result.charAt(i);
					
				}
				if (result.equals(rev)) {
					System.out.println("회문수입니다");
				}else {
					System.out.println("회문수가 아닙니다");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					//finally 영역 안에서 스트림을 닫아주면 
					//예외 유뮤와 상관없이 스트림을 닫을 수 있기 때문에 유용
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}//if
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
