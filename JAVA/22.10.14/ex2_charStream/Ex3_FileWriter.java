package ex2_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {

	public static void main(String[] args) {

		FileWriter fw = null;

		String path = "C:\\java_0914_yjw\\fileWriter예제.txt";

		try {
			fw = new FileWriter(path);
			String msg1 = "나는 fileWriter의 예제다!!";
			String msg2 = "\n두번째 줄도 쓸 수 있다!";

			fw.write(msg1);
			fw.write(msg2);
			
//			fw를 close()할 때, 내용을 물리적으로 기록하는 flush()메서드가 자동으로
//			호출되기 때문에, 반드시 close()를 통해 작성하고자 하는 내용을
//			물리적으로 기록할 수 있도록 처리해줘야 한다.
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
