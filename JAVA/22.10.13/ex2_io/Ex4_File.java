package ex2_io;

import java.io.File;

public class Ex4_File {

	public static void main(String[] args) {
	
		
		String path = "C:\\java_0914_yjw\\abc ";
		File f1 = new File(path);
		
		if (!f1.exists()) {
			//f1.exists() : f1�� ���� ��ΰ� ���������� �����Ѵٸ� true
			System.out.println("������ �����մϴ�");
			f1.mkdirs();//���� ���� (�ܼ��� ���� �ϳ��� ���� ����)
			
		}else {
			System.out.println("�̹� �����ϴ� ������");
		}
		
		
		
	}

}
