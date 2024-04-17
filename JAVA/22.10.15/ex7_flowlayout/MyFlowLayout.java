package ex7_flowlayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFlowLayout {

	public static void main(String[] args) {
		
		Frame f = new Frame("flowLayout예제");
		f.setBounds(500,200,400,300);
	
		//프레임의 레이아웃 속성을  FlowLayout으로 지정
		f.setLayout(new FlowLayout());
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		Button btn6 = new Button("버튼6");
		
		
		btn1.setSize(200,100); //이렇게 사이즈 바꾸는 건 할 수 없음
		
		//FlowLayout에서의 버튼 크기 변경은 아래와 같이 한다
		btn1.setPreferredSize(new Dimension(200,100));
		
		
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);

		
		
		
		
		
		
//		f.setBackground(Color.MAGENTA);

		f.setResizable(false); //기본사이즈 고정 -> 최초 사이즈로 고정
		f.setVisible(true);
	
	
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); //종료 코드
	
	
	}

}
