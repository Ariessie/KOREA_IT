package ex3_window_listener;

import java.awt.Frame;

public class FrameEvent {

	public static void main(String[] args) {

		Frame f = new Frame("���� �̺�Ʈ");
		
//		f.setBounds(x��ǥ, y��ǥ, �ʺ�width, ����height);
		f.setBounds(500, 200, 400, 300);

		//�����ӿ��� ���� ��ư�� �̺�Ʈ ������ ���
		f.addWindowListener(new MyTestListener());
		f.setVisible(true);
		
	}
}
