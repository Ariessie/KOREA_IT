package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreSave {

	public ScoreSave(RspInfo rsp) {

		// C:\\java_0914_yjw\\RspScore\\�����̸�\\UserInfo.sav
		String path = "C:\\java_0914_yjw\\RspScore\\" + rsp.getId() + "\\UserInfo.sav";

		File f = new File("C:\\java_0914_yjw\\RspScore\\" + rsp.getId());
		
		if (!f.exists()) {
			f.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//���� ����
		try {
			fos = new FileOutputStream(path);
			
//			ObjectStream (byte ���)
//			ObjectStream�� ����ϸ� ����ڰ� ������ Ŀ���� Ŭ������ ������ ������ �� �ִ�.
//
//			Ŀ���� Ŭ���� : atm, banding, account, -> �ڹٿ��� �������� �ʴ� ���� ���� Ŭ����
//
//			Object�������� ��� ��ü�� ������ �� �����Ƿ�, �⺻�ڷ��� �� �ƴ϶� 
//			��ü����� ������� ��������.
//
//			Ư�� Ŭ������ ������ ��°�� �����ϰų�, �о� �� �� �ִٴ� ������ ����
			
			oos = new ObjectOutputStream(fos);
			oos.writeObject(rsp); //rsp��ü�� ��°�� ����
			System.out.println("����Ϸ�");
		} catch (Exception e) {
			System.out.println("�������");
			e.printStackTrace();
		}finally {
			try {
				//�������� ��Ʈ���� ���� ���� ������ �������� �ݾƾ� �Ѵ�.
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		
	}//������








}
