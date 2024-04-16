package ex2_io;

import java.io.File;

public class Ex1_File {

	public static void main(String[] args) {
		/*
		  [ IO (Input, Output) ]
		   IO는 입출력 스트림을 의미
		      스트림이란, 데이터를 입출력 하기 위한 일종의 통로
		   JVM에서 콘솔의 데이터를 읽어 온다던지, 반대로 JVM의 데이터를 콘솔에 쓰는 
		      작업등을 가능하게 해 준다.
		  
		  파일 클래스가 접근할 path경로 
		  
		 */
		
		String path = "C:\\java_0914_yjw\\test.txt";
		File f = new File(path);
		
		if (f.isFile()) { //file클래스의 path경로가 파일형식인 경우
			System.out.println(f.length()+ "byte");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
