package ex9_button_event;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex3_ButtonEvent {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(800, 200, 1000, 500);
		f.setLayout(new FlowLayout());

		Button btn1 = new Button("��ư 1");
		Button btn2 = new Button("��ư 2");
		Button btn3 = new Button("��ư 3");
		Button btn4 = new Button("��ư 4");

		btn1.setPreferredSize(new Dimension(200, 100));
		btn2.setPreferredSize(new Dimension(200, 100));
		btn3.setPreferredSize(new Dimension(200, 100));
		btn4.setPreferredSize(new Dimension(200, 100));

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		// ��ư�� �̺�Ʈ ������ ����ϱ�3
	     Ex3_EventListener al = new Ex3_EventListener();
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);

		
		
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // ���� �ڵ�

		
		
		

	}

}
