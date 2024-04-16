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

		Frame frame = new Frame("���� �Է±�");
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.ORANGE);
		frame.setLayout(new BorderLayout());

		// ��Ʈ
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

		// ���ʴ�
		// ������Ʈ���� �ϳ��� ��� �����Ѵ�!
		// �⺻ ���̾ƿ��� FlowLayout���� �����Ǿ� �ִ�.
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.DARK_GRAY);
		pNorth.setFont(font);

		// Ű���忡�� ���� �Է¹ޱ� ���� �Է»���
		TextField tf = new TextField(15);
		Button btn = new Button("�Է�");
		btn.setEnabled(false); // ��ư ��Ȱ��ȭ -> Ŭ�� x

		pNorth.add(tf);
		pNorth.add(btn);
		frame.add(pNorth, "North");

		// ���ʴ�
		Panel pSouth = new Panel();
		pSouth.setBackground(Color.ORANGE);
		Button btnSave = new Button("����");
		Button btnClose = new Button("�ݱ�");

		pSouth.add(btnSave);
		pSouth.add(btnClose);

		frame.add(pSouth, BorderLayout.SOUTH);

		// �߾Ӵ�
		// Ű���带 ���� �幮�� �Է¹ް��� �� �� ����ϴ� Ŭ����
		// TextArea(�ʱ⹮��, ���� ũ��, ���� ����, ��ũ�� ����);
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setEditable(false);
		frame.add(ta, "Center");

		// TextField�� ���� �� ��쿡�� �Է� ��ư�� Ȱ��ȭ
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

		// �Է¹�ư Ŭ���� TextArea�� ������ �߰�
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ta�� ��� ���� ���뿡 ���ο� ���� �̾���̴� �޼���
				ta.append(tf.getText() + "\n");

				// ta�� ��� ��� ������ ��°�� ��ü
				// ta.setText(tf.getText());

				tf.setText("");
				tf.requestFocus();// tf�� Ŀ���� �̵�
			}
		});

		// �ݱ� ��ư�� �̺�Ʈ ������ ���

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				System.exit(0); => �����ִ� ��� ������
				frame.dispose(); // ���� �����Ӹ� ����
			}
		});

		
		
		// �����ư �̺�Ʈ ������ ���

		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//ta�� ������ �����´�
				String message = ta.getText();
				
				FileWriter fw = null;
				
				try {
				FileDialog fd = new FileDialog(frame);
					fd.setVisible(true);
					System.out.println(fd.getDirectory()+fd.getFile());
				
					String path = fd.getDirectory()+fd.getFile();
					
					fw = new FileWriter(path);
					fw.write(message);
					
					
					JOptionPane.showMessageDialog(frame, "���强��");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frame, "�������\n�����ڿ��� �����ϼ���");
					
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

		// ���� �ڵ�
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// main

}
