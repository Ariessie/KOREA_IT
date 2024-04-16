package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(200, 200, 400, 400);
		f.setLayout(null); //�ڵ���ġ ����
		
		//�����ӿ� �ڵ���ġ�� ���� �������ʹ� �����ӿ� �߰��� ������Ʈ��(button��...)��
		//������ size�� location�Ӽ��� ������ �־�� �Ѵ�.
		
		Button btnOk = new Button("Ȯ��");
		Button btnClose = new Button("�ݱ�");
		
		btnOk.setBounds(70,90,100,50);
		btnClose.setBounds(240,90,100,50);
		
		//frame�� ��ư �߰�
		f.add(btnOk); //������ Ȯ�� ������ ��� ��ü�� component�� �ڽ�
		f.add(btnClose);
				
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); //���� �ڵ�

		
		
		
		
		
	}// main

}
