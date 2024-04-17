package ex2_charStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {

	public static void main(String[] args) {
		// test.txt�� char��Ʈ������ �о�� ��
		//�о�� �����Ϳ� ���ĺ� �빮�ڿ� �ҹ��ڰ� ���� � �ִ��� ���
		
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
		
			System.out.println("�빮��: "+upper);
			System.out.println("�ҹ���: "+lower);	
			
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
