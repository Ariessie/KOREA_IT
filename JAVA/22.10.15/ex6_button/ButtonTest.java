package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(200, 200, 400, 400);
		f.setLayout(null); //자동배치 끄기
		
		//프레임에 자동배치를 끄는 순간부터는 프레임에 추가될 컴포넌트들(button등...)이
		//각각의 size와 location속성을 가지고 있어야 한다.
		
		Button btnOk = new Button("확인");
		Button btnClose = new Button("닫기");
		
		btnOk.setBounds(70,90,100,50);
		btnClose.setBounds(240,90,100,50);
		
		//frame에 버튼 추가
		f.add(btnOk); //눈으로 확인 가능한 모든 객체는 component의 자식
		f.add(btnClose);
				
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); //종료 코드

		
		
		
		
		
	}// main

}
