package ex1_checkbox;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {

	public static void main(String[] args) {
		Frame f = new Frame("질문");
		f.setBounds(500, 100, 800, 250);
		f.setLayout(null);// 자동배치 끄기

		// 텍스트를 표기하는 Label
		Label q1 = new Label("관심분야는?");
		Font font = new Font("굴림", Font.BOLD, 30);

		q1.setBounds(10, 50, 180, 40);
		q1.setBackground(Color.ORANGE);
		q1.setFont(font);

		// 체크박스 생성
		Checkbox music = new Checkbox("음악");
		Checkbox movie = new Checkbox("영화");
		Checkbox book = new Checkbox("독서");

		music.setBounds(10, 90, 50, 30);
		music.setBackground(Color.LIGHT_GRAY);

		movie.setBounds(70, 90, 50, 30);
		movie.setBackground(Color.LIGHT_GRAY);

		book.setBounds(130, 90, 50, 30);
		book.setBackground(Color.lightGray);

		// 체크박스에 이벤트 감지자 등록

		// 음악
		music.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				String str = e.getStateChange() == 1 ? "음악 선택함" : "음악 선택 해제";
				System.out.println(str);
			}
		});

		
		// 체크박스에 이벤트 감지자 등록 ver 2.0
		ItemListener it = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getItem().toString().equals("독서")) {
					String str = e.getStateChange() == 1 ? "독서 선택함" : "독서 선택 해제";
					System.out.println(str);
				} else if (e.getItem().toString().equals("영화")) {
					String str = e.getStateChange() == 1 ? "영화 선택함" : "영화 선택 해제";
					System.out.println(str);
				} 
					
			}
		};

		book.addItemListener(it);
		movie.addItemListener(it);
		
		

		// 프레임에 추가
		f.add(q1);
		f.add(music);
		f.add(movie);
		f.add(book);

		// 프레임 띄우기
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
