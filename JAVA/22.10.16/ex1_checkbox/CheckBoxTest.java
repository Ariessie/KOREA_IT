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
		Frame f = new Frame("����");
		f.setBounds(500, 100, 800, 250);
		f.setLayout(null);// �ڵ���ġ ����

		// �ؽ�Ʈ�� ǥ���ϴ� Label
		Label q1 = new Label("���ɺоߴ�?");
		Font font = new Font("����", Font.BOLD, 30);

		q1.setBounds(10, 50, 180, 40);
		q1.setBackground(Color.ORANGE);
		q1.setFont(font);

		// üũ�ڽ� ����
		Checkbox music = new Checkbox("����");
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox book = new Checkbox("����");

		music.setBounds(10, 90, 50, 30);
		music.setBackground(Color.LIGHT_GRAY);

		movie.setBounds(70, 90, 50, 30);
		movie.setBackground(Color.LIGHT_GRAY);

		book.setBounds(130, 90, 50, 30);
		book.setBackground(Color.lightGray);

		// üũ�ڽ��� �̺�Ʈ ������ ���

		// ����
		music.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				String str = e.getStateChange() == 1 ? "���� ������" : "���� ���� ����";
				System.out.println(str);
			}
		});

		
		// üũ�ڽ��� �̺�Ʈ ������ ��� ver 2.0
		ItemListener it = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getItem().toString().equals("����")) {
					String str = e.getStateChange() == 1 ? "���� ������" : "���� ���� ����";
					System.out.println(str);
				} else if (e.getItem().toString().equals("��ȭ")) {
					String str = e.getStateChange() == 1 ? "��ȭ ������" : "��ȭ ���� ����";
					System.out.println(str);
				} 
					
			}
		};

		book.addItemListener(it);
		movie.addItemListener(it);
		
		

		// �����ӿ� �߰�
		f.add(q1);
		f.add(music);
		f.add(movie);
		f.add(book);

		// ������ ����
		f.setVisible(true);

		// ���� �ڵ�
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// main

}
