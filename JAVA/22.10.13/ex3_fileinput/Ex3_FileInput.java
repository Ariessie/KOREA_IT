package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex3_FileInput {

	public static void main(String[] args) {
		// file.txt�� ������ �о� ȸ�������� �ƴ����� �Ǵ��Ͻÿ�

		String path = "C:\\java_0914_yjw\\file.txt";
		
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		FileInputStream fis = null;
		String result = "";

		String rev="";
		
		if (f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				fis.read(read); //���������͸� �о read�迭�� ��´�
				result = new String(read);//read�迭�� ���� ���ڿ��� ����
				for (int i = result.length()-1; i >=0 ; i--) {
					rev += result.charAt(i);
					
				}
				if (result.equals(rev)) {
					System.out.println("ȸ�����Դϴ�");
				}else {
					System.out.println("ȸ������ �ƴմϴ�");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					//finally ���� �ȿ��� ��Ʈ���� �ݾ��ָ� 
					//���� ���¿� ������� ��Ʈ���� ���� �� �ֱ� ������ ����
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}//if
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
