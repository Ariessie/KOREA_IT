package ex2_inheritance;

public class AnimalMain {

	public static void main(String[] args) {

		Elephant ele = new Elephant();
		System.out.println("----�ڳ���----");
		System.out.println("��: " + ele.getEye());
		System.out.println("�ٸ�: " + ele.getLeg());
		System.out.println("Ư¡: " + ele.special);
		System.out.println();
		
		Lion lion = new Lion();
		System.out.println("----����----");
		System.out.println("��: " + lion.getEye());
		System.out.println("�ٸ�: " + lion.getLeg());
		System.out.println("Ư¡: " + lion.special);
		System.out.println();
		
		Rabbit rb = new Rabbit();
		System.out.println("----�䳢----");
		System.out.println("��: " + rb.getEye());
		System.out.println("�ٸ�: " + rb.getLeg());
		System.out.println("Ư¡: " + rb.special);
		
		
		Snake sn = new Snake();
		System.out.println("----��----");
		System.out.println("��: " + sn.getEye());
		System.out.println("�ٸ�: " + sn.getLeg());
		System.out.println("Ư¡: " + sn.special);
		System.out.println();
		
		Spider sp = new Spider();
		System.out.println("----�Ź�----");
		System.out.println("��: " + sp.getEye());
		System.out.println("�ٸ�: " + sp.getLeg());
		System.out.println("Ư¡: " + sp.special);
		
		
		
		
	}

}
