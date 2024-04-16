package ex9_button_event;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_ButtonEvent {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(800, 200, 1000, 500);
		f.setLayout(new FlowLayout());

		Button btn1 = new Button("버튼 1");
		Button btn2 = new Button("버튼 2");
		Button btn3 = new Button("버튼 3");
		Button btn4 = new Button("버튼 4");

		btn1.setPreferredSize(new Dimension(200, 100));
		btn2.setPreferredSize(new Dimension(200, 100));
		btn3.setPreferredSize(new Dimension(200, 100));
		btn4.setPreferredSize(new Dimension(200, 100));

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		// 버튼에 이벤트 감지자 등록하기2

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				switch (e.getActionCommand()) {

				case "버튼 1":
					System.out.println("안녕");
					break;

				case "버튼 2":
					Frame f2 = new Frame();
					f2.setBounds(100, 100, 200, 200);
					f2.setVisible(true);
					f2.addWindowListener(new WindowAdapter() {

						@Override
						public void windowClosing(WindowEvent e) {
//							System.exit(0);  -> 모든 것 다 종료
							f2.dispose();
						}
					}); // 종료 코드
					break;

				}

			}
		};

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
		}); // 종료 코드

	}

}
