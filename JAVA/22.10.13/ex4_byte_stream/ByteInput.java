package ex4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ByteInput {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		byte[] read = new byte[100];
		byte[] keyboard = new byte[100];
		
		try {
		
			System.out.print("°æ·Î: ");
			System.in.read(keyboard);
			
			String path = new String(keyboard).trim();
			fis = new FileInputStream(path);
			fis.read(read);
			System.out.println(new String(read).trim());
		} catch (Exception e) {
			
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
