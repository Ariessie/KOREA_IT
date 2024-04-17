package ex4_image;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest2 {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 200, 700, 700);

		
		//이미지 준비
		ImageIcon img = new ImageIcon("22.png");
		ImageIcon img2 = new ImageIcon("ll.png");
		
		//이미지를 Frame에 추가하기 위해서는 반드시 JLabel에 탑재해야 한다
		JLabel jl = new JLabel(img);
		jl.setBounds(0,0,512,512);
//		jl.setBounds(0,0,200,250);
		
		Button btn1 = new Button("이미지1");
		btn1.setBounds(300,100,100,70);
		f.add(btn1);
		
		Button btn2 = new Button("이미지2");
		btn2.setBounds(300,200,100,70);
		f.add(btn2);
		
		
	
		
		
		
//		JLabel j2 = new JLabel(img2);
//		jl.setBounds(50,50,900,520);
		
		//먼저 추가한 이미지가 더 위쪽으로 올라옴
		
		f.add(jl);
//		f.add(j2);
		
		
		
		
		//버튼클릭 이벤트 감지자
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("이미지1")) {
					jl.setIcon(img);
				}else {
					jl.setIcon(img2);
				}
			}
		};
		
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		
		
		
		f.setVisible(true);

		// 종료 코드
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		
		
		
	}// main

}
