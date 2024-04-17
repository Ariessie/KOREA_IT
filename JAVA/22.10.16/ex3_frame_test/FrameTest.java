package ex3_frame_test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.activation.FileDataSource;
import javax.swing.JOptionPane;

public class FrameTest {

	public static void main(String[] args) {

		Frame frame = new Frame("문장 입력기");
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.ORANGE);
		frame.setLayout(new BorderLayout());

		// 폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

		// 북쪽단
		// 컴포넌트들을 하나로 묶어서 관리한다!
		// 기본 레이아웃은 FlowLayout으로 설정되어 있다.
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.DARK_GRAY);
		pNorth.setFont(font);

		// 키보드에서 값을 입력받기 위한 입력상자
		TextField tf = new TextField(15);
		Button btn = new Button("입력");
		btn.setEnabled(false); // 버튼 비활성화 -> 클릭 x

		pNorth.add(tf);
		pNorth.add(btn);
		frame.add(pNorth, "North");

		// 남쪽단
		Panel pSouth = new Panel();
		pSouth.setBackground(Color.ORANGE);
		Button btnSave = new Button("저장");
		Button btnClose = new Button("닫기");

		pSouth.add(btnSave);
		pSouth.add(btnClose);

		frame.add(pSouth, BorderLayout.SOUTH);

		// 중앙단
		// 키보드를 통해 장문을 입력받고자 할 때 사용하는 클래스
		// TextArea(초기문장, 행의 크기, 열의 길이, 스크롤 여부);
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setEditable(false);
		frame.add(ta, "Center");

		// TextField에 값이 들어간 경우에만 입력 버튼을 활성화
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().equals("")) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}

			}
		});

		// 입력버튼 클릭시 TextArea에 내용을 추가
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ta에 담긴 기존 내용에 새로운 값을 이어붙이는 메서드
				ta.append(tf.getText() + "\n");

				// ta에 담긴 모든 내용을 통째로 교체
				// ta.setText(tf.getText());

				tf.setText("");
				tf.requestFocus();// tf로 커서를 이동
			}
		});

		// 닫기 버튼에 이벤트 감지자 등록

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				System.exit(0); => 열려있는 모든 프레임
				frame.dispose(); // 현재 프레임만 종료
			}
		});

		
		
		// 저장버튼 이벤트 감지자 등록

		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//ta의 내용을 가져온다
				String message = ta.getText();
				
				FileWriter fw = null;
				
				try {
				FileDialog fd = new FileDialog(frame);
					fd.setVisible(true);
					System.out.println(fd.getDirectory()+fd.getFile());
				
					String path = fd.getDirectory()+fd.getFile();
					
					fw = new FileWriter(path);
					fw.write(message);
					
					
					JOptionPane.showMessageDialog(frame, "저장성공");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frame, "저장실패\n관리자에게 문의하세요");
					
				}finally {
					try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
			}
		});

		
		
		
		//
		frame.setResizable(false);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
		});

		frame.setVisible(true);

		// 종료 코드
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// main

}
