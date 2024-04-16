package ex8_borderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyBoderLayout {

	public static void main(String[] args) {
		
		Frame f = new Frame("BorderLayout ����");
		f.setBounds(500,300,400,300);
		
		
		//BoderLayout�� ��,��,��,��, �߾��� �ټ���ġ �� ��� ��ġ��ų ��������
		//�����ؼ� �ڸ��� ����ִ� ���̾ƿ�
		f.setLayout(new BorderLayout());
		Button btn1 = new Button("��");
		Button btn2 = new Button("��");
		Button btn3 = new Button("�߾�");
		Button btn4 = new Button("��");
		Button btn5 = new Button("��");
		
		btn1.setPreferredSize(new Dimension(400,100));
		
		
		
		f.add(btn1, "North");
		f.add(btn2, BorderLayout.WEST);
		f.add(btn3, BorderLayout.CENTER);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.SOUTH);
		
		
		f.setVisible(true);
		
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); //���� �ڵ�
		
		
	}

}