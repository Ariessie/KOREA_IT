package ex6_abstract;

import java.io.ObjectInputStream.GetField;

public class UnitMain {

	public static void main(String[] args) {
		
		Terran t = new Terran("�غ�", 100, false);
		t.decEnergy();
		t.decEnergy();
		System.out.println("t:"+t.getEnergy());
		
		
		Protoss p = new Protoss("��Ʋ", 150,true);
		p.decEnergy();
		System.out.println("p:"+p.getEnergy());
		
		
		
		Zerg z = new Zerg("�����", 200, false);
		z.decEnergy();
		System.out.println("z:"+z.getEnergy());
		

	}

}
