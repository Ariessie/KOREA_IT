package ex3_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {

	public static void main(String[] args) {
		// RspInfo Ŭ������ Ȱ���Ͽ� ���������� ������ ����
		
		//id : a
		//���� (s) | ���� (r) | �� (p) : r
		//1�� 0�� 0��
		//�ٽ� �Ͻðڽ��ϱ�? y | n : n
		///������ �����մϴ�.
		
	
		RspInfo rsp = new RspInfo();
		Scanner sc = new Scanner(System.in);
		
		String id= "";
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.print("id: ");
		id = sc.next();
		rsp.setId(id);
		
		ScoreLoader sl = new ScoreLoader(id);
		//�ε�
		try {
			
			win = sl.getRsp().getWin();
			lose = sl.getRsp().getLose();
			draw = sl.getRsp().getDraw();
			
			rsp.setWin(win);
			rsp.setLose(lose);
			rsp.setDraw(draw);
		} catch (Exception e) {
			
		}
		
		
		System.out.printf("%d�� %d�� %d��\n",win,draw,lose);	
		
		while (true) {
			
			int rnd = new Random().nextInt(3);
			//0:����, 1:����, 2:��
			System.out.print("���� (s) | ���� (r) | �� (p) : ");
			String user = sc.next();
			
			int usercnt = 0;
			if (user.equalsIgnoreCase("s")) {
				usercnt = 0;
			}else if (user.equalsIgnoreCase("r")) {
				usercnt = 1;
			}else if (user.equalsIgnoreCase("p")){
				usercnt = 2;
			}
			
			
			//����� ��
			
			if (usercnt - rnd == -2 || usercnt - rnd == 1) {
				System.out.println("�̰���ϴ�.");
				rsp.setWin(++win);
			}else if (usercnt - rnd == 0) {
				System.out.println("�����ϴ�");
				rsp.setDraw(++draw);
						
			}else{
				System.out.println("�����ϴ�");
				rsp.setLose(++lose);
			}
			
			System.out.printf("%d�� %d�� %d��\n",rsp.getWin(),rsp.getDraw(),rsp.getLose());	
			
			
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? y | n : ");
			if (!sc.next().equalsIgnoreCase("y")) {
				break;
			}
			
		}//while
		
		System.out.println("��������");
		
		new ScoreSave(rsp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
