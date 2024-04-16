package ex2_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {

	public static void main(String[] args) {

		FileWriter fw = null;

		String path = "C:\\java_0914_yjw\\fileWriter����.txt";

		try {
			fw = new FileWriter(path);
			String msg1 = "���� fileWriter�� ������!!";
			String msg2 = "\n�ι�° �ٵ� �� �� �ִ�!";

			fw.write(msg1);
			fw.write(msg2);
			
//			fw�� close()�� ��, ������ ���������� ����ϴ� flush()�޼��尡 �ڵ�����
//			ȣ��Ǳ� ������, �ݵ�� close()�� ���� �ۼ��ϰ��� �ϴ� ������
//			���������� ����� �� �ֵ��� ó������� �Ѵ�.
//			fw.flush();
			
			
		} catch (Exception e) {

		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
