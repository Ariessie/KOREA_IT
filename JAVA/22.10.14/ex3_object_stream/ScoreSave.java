package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreSave {

	public ScoreSave(RspInfo rsp) {

		// C:\\java_0914_yjw\\RspScore\\유저이름\\UserInfo.sav
		String path = "C:\\java_0914_yjw\\RspScore\\" + rsp.getId() + "\\UserInfo.sav";

		File f = new File("C:\\java_0914_yjw\\RspScore\\" + rsp.getId());
		
		if (!f.exists()) {
			f.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//파일 쓰기
		try {
			fos = new FileOutputStream(path);
			
//			ObjectStream (byte 기반)
//			ObjectStream을 사용하면 사용자가 구현한 커스텀 클래스의 내용을 저장할 수 있다.
//
//			커스텀 클래스 : atm, banding, account, -> 자바에는 존재하지 않는 내가 만든 클래스
//
//			Object형식으로 모든 객체를 수용할 수 있으므로, 기본자료형 뿐 아니라 
//			객체들까지 입출력이 가능해짐.
//
//			특정 클래스의 내용을 통째로 저장하거나, 읽어 올 수 있다는 장점을 가짐
			
			oos = new ObjectOutputStream(fos);
			oos.writeObject(rsp); //rsp객체를 통째로 저장
			System.out.println("저장완료");
		} catch (Exception e) {
			System.out.println("저장실패");
			e.printStackTrace();
		}finally {
			try {
				//여러개의 스트림을 닫을 때는 생성된 역순으로 닫아야 한다.
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		
	}//생성자








}
