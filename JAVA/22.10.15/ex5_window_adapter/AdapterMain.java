package ex5_window_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterMain {

	public static void main(String[] args) {
		
		
		
		Frame f = new Frame();
		f.setBounds(400,300,400,400);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
		f.setVisible(true);
	
	
	
	}

}
