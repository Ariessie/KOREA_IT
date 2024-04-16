package ex1_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class WordGame extends Thread {

	private ArrayList<String> arr;
	private String[] data;
	private boolean isPlaying = true; // 스레드를 정지시키기 위한 변수

	public WordGame(ArrayList<String> arr, String[] data) {
		this.arr = arr;
		this.data = data;
	}

public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}




	@Override
	public void run() {

		while (isPlaying) {
			//3초 간격으로 data배열의 값 중 하나를 임의로 선택
			
			int rand = new Random().nextInt(data.length);
			
			
			//임의로 선택된 단어를 arr에 저장
			arr.add(data[rand]);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
