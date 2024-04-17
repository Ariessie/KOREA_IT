package ex1_output;



import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos= new FileOutputStream("C:\\java_0914_yjw\\fileOutput.txt");
			String msg1 = "fileOutput스트림의 예제입니다";
			byte[] by = msg1.getBytes();
			String msg2 = "\n나는 2번째 줄 입니다.";
			
			fos.write(by);
			fos.write(msg2.getBytes());
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}//main

}
