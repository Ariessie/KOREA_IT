package ex9_button_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3_EventListener implements ActionListener {

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("��ư 1")) {
			System.out.println("��ư1�� Ŭ����");
		}else if(e.getActionCommand().equals("��ư 2")) {
			System.out.println("��ư2�� Ŭ����");
	
		}
		
	}//�߻�޼���
	
	
	
	

}
