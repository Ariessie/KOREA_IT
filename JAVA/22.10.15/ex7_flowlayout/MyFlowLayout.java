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
		
		Frame f = new Frame("flowLayout����");
		f.setBounds(500,200,400,300);
	
		//�������� ���̾ƿ� �Ӽ���  FlowLayout���� ����
		f.setLayout(new FlowLayout());
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");
		Button btn5 = new Button("��ư5");
		Button btn6 = new Button("��ư6");
		
		
		btn1.setSize(200,100); //�̷��� ������ �ٲٴ� �� �� �� ����
		
		//FlowLayout������ ��ư ũ�� ������ �Ʒ��� ���� �Ѵ�
		btn1.setPreferredSize(new Dimension(200,100));
		
		
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);

		
		
		
		
		
		
//		f.setBackground(Color.MAGENTA);

		f.setResizable(false); //�⺻������ ���� -> ���� ������� ����
		f.setVisible(true);
	
	
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); //���� �ڵ�
	
	
	}

}
