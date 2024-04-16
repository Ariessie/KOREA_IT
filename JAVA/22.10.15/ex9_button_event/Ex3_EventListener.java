package ex9_button_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3_EventListener implements ActionListener {

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("버튼 1")) {
			System.out.println("버튼1번 클릭함");
		}else if(e.getActionCommand().equals("버튼 2")) {
			System.out.println("버튼2번 클릭함");
	
		}
		
	}//추상메서드
	
	
	
	

}
