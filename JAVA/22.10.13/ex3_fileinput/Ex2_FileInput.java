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
				fis.read(read); //fis�� �о�� ������ read�迭�� 1byte�� ����
				
				//read��� ����Ʈ �迭�� ���ڿ� result�� �����ϴ� �ڵ�
				String result = new String(read);
				System.out.println(result);
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				try {
					//finally ���� �ȿ��� ��Ʈ���� �ݾ��ָ� 
					//���� ���¿� ������� ��Ʈ���� ���� �� �ֱ� ������ ����
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		
		

	}

}
