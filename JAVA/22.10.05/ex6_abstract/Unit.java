package ex6_abstract;

public abstract class Unit {

	String name;
	int energy;
	boolean fly;
	
	//unit�� ������ ���ϸ� �ش� �޼��带 ȣ���ϵ��� ����
//��, �������� �ǰݽ� ������ ���ҷ��� �ٸ� �� �����Ƿ� �߻����� ����.
	abstract public void decEnergy();
	
	
	
	public int getEnergy() {
		return energy;
	}
	
	
	
	
	
	
	
}
