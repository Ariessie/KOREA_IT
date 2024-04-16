package ex2_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex1_Choice {

	public static void main(String[] args) {
		
		
		Frame f = new Frame();
		f.setBounds(400,200,300,250);
		f.setLayout(null); //자동배치 끄기
		
		
		//선택상자
		Choice blood = new Choice();
		blood.add("혈액형은 무엇입니까?");
		blood.add("A");
		blood.add("B");
		blood.add("O");
		blood.add("AB");
		//choice객체의 높이는 안에 있는 목록의 사이즈로 결정되므로 
		//0으로 넣어도 무관하다.
		blood.setBounds(50,100,200,0);
		
		//choice에 이벤트 감지자 등록
		blood.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				String str = (String)e.getItem();
				System.out.println("당신의 혈액형은 "+str);
			}
		});
		
		
		//frame에 choice 추가
		f.add(blood);
		
		
		f.setVisible(true);
		
		
		
		
		
		
		
		// 종료 코드
				f.addWindowListener(new WindowAdapter() {

					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
		
		
		
		
	}

}
