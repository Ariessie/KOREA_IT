package ex1_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class WordGame extends Thread {

	private ArrayList<String> arr;
	private String[] data;
	private boolean isPlaying = true; // �����带 ������Ű�� ���� ����

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
			//3�� �������� data�迭�� �� �� �ϳ��� ���Ƿ� ����
			
			int rand = new Random().nextInt(data.length);
			
			
			//���Ƿ� ���õ� �ܾ arr�� ����
			arr.add(data[rand]);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
