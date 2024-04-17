package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {

	public static void main(String[] args) {
		
		
		/*
		 
		 ��Ʈ���� ����
		 ...Stream : byte����� ��Ʈ��
		 ...Reader, ...Writer: char����� ��Ʈ��
		  
		  
		  
		  
		  
		  
		 */
		
		
		
		
		String path = "C:\\java_0914_yjw\\test.txt";
		File f = new File(path);
		
		if (f.exists()) {
			
			//���ϰ� ����� �Է½�Ʈ�� ����
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				//��Ʈ���� read()�� ���� byte ������ �ƽ�Ű �ڵ尪�� �о���µ�,
				//�ݺ��� �����ϴٰ� ���̻� ���� ���� ���� ��, -1�� �����´�
				//������ ���� (EOF)-1�� ������ �ݺ����� ����ȴ�. 
				int code = -1;
				while ((code = fis.read()) != -1) {
				
					System.out.print((char)code);
				}
				
				//�о���� �۾��� �������Ǹ� �ݵ�� ��Ʈ���� �ݾ��ش�
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		

	}//main

}
