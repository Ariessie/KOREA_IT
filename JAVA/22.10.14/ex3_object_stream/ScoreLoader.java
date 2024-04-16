package ex3_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ScoreLoader {
	
	private RspInfo rsp;
	
	
	public RspInfo getRsp() {
		return rsp;
	}




	public ScoreLoader(String id) {
		
		String path = "C:\\java_0914_yjw\\RspScore\\" + id + "\\UserInfo.sav";
		
		File f = new File(path);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if (f.exists()) {
			
			//데이터 로드하기!
			try {
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				
				//ois를 통해 RspInfo객체를 로드
				rsp = (RspInfo)ois.readObject();
				
				
				
				
			} catch (Exception e) {
			System.out.println("로드 실패");	
			}finally {
				
				try {
					ois.close();
					fis.close();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			
			
			
			
			
			
		}else {
			System.out.println(id+"님 첫 접속을 환영합니다");
		}
		
		
		
	}
	
	
	
	

}
