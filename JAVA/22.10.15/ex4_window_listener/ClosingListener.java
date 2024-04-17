package ex4_window_listener;

import java.awt.event.WindowEvent;

public class ClosingListener extends AllListener {

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		//정상 종료 : 0 비정상 종료 : -1
	}
	
	
	
	
}
