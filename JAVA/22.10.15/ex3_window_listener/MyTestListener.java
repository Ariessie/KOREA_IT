package ex3_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyTestListener implements WindowListener {

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//우상단 x버튼 클릭시 호출되는 메서드
		System.out.println("종료버튼 누름");
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// 최소화시켰다가 원래의 상태로 돌아왔을 때 호출되는 메서드
		System.out.println("원래대로 돌아옴");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// 최소화버튼 눌렀을 때 호출되는 메서드
		System.out.println("최소화됨");
		
		
		
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
