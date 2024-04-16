package ex3_anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2_anonyInner {

	public static void main(String[] args) {

		Frame f = new Frame();
		Button btn = new Button("버튼");
		f.setSize(300, 300);
		f.add(btn);
		
		//버튼에 이벤트 감지자 등록
		
//		ActionListener a1 = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("안녕");
//			}
//			
//		};
//		
//		
//		btn.addActionListener(a1);
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료합니다.");
				System.exit(0); //프레임 종료
				
				
			}
		});
		f.setVisible(true);
		
		
		
		

	}

}
