package ex3_window_listener;

import java.awt.Frame;

public class FrameEvent {

	public static void main(String[] args) {

		Frame f = new Frame("우상단 이벤트");
		
//		f.setBounds(x좌표, y좌표, 너비width, 높이height);
		f.setBounds(500, 200, 400, 300);

		//프레임에서 우상단 버튼의 이벤트 감지자 등록
		f.addWindowListener(new MyTestListener());
		f.setVisible(true);
		
	}
}
