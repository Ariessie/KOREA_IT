package ex1_output;



import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos= new FileOutputStream("C:\\java_0914_yjw\\fileOutput.txt");
			String msg1 = "fileOutput��Ʈ���� �����Դϴ�";
			byte[] by = msg1.getBytes();
			String msg2 = "\n���� 2��° �� �Դϴ�.";
			
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
