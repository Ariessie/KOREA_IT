package ex3_object_stream;

import java.io.Serializable;

public class RspInfo implements Serializable {
	//일반적인 클래스는 객체가 생성될 때 멤버변수가 메모리상에 각각 흩어진 채로 만들어진다.
	// 직열화를 통해 멤버변수들을 배열형태로 일렬로 만들어 저장해줘야 한다.
	// Serializable을 구현해두면 JVM이 알아서 현재클래스 (RspInfo)의 멤버변수들을 직렬화 시켜준다.

	private int win,lose,draw;
	private String id;
	
	
	
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
	
	

}
