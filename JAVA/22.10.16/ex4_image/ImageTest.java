package ex4_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

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
//		jl.setBounds(0,0,500,512);
		
		JLabel j2 = new JLabel(img2);
		jl.setBounds(50,50,300,250);
		
		//���� �߰��� �̹����� �� �������� �ö��
		
		f.add(jl);
		f.add(j2);
		
		
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
