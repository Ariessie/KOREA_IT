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

		
		//�̹��� �غ�
		ImageIcon img = new ImageIcon("22.png");
		ImageIcon img2 = new ImageIcon("ll.png");
		
		//�̹����� Frame�� �߰��ϱ� ���ؼ��� �ݵ�� JLabel�� ž���ؾ� �Ѵ�
		JLabel jl = new JLabel(img);
		jl.setBounds(0,0,512,512);
//		jl.setBounds(0,0,200,250);
		
		Button btn1 = new Button("�̹���1");
		btn1.setBounds(300,100,100,70);
		f.add(btn1);
		
		Button btn2 = new Button("�̹���2");
		btn2.setBounds(300,200,100,70);
		f.add(btn2);
		
		
	
		
		
		
//		JLabel j2 = new JLabel(img2);
//		jl.setBounds(50,50,900,520);
		
		//���� �߰��� �̹����� �� �������� �ö��
		
		f.add(jl);
//		f.add(j2);
		
		
		
		
		//��ưŬ�� �̺�Ʈ ������
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("�̹���1")) {
					jl.setIcon(img);
				}else {
					jl.setIcon(img2);
				}
			}
		};
		
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		
		
		
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
