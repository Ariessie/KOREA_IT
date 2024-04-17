package ex6_abstract;

public abstract class Unit {

	String name;
	int energy;
	boolean fly;
	
	//unit이 공격을 당하면 해당 메서드를 호출하도록 하자
//단, 종족별로 피격시 에너지 감소량이 다를 수 있으므로 추상으로 정의.
	abstract public void decEnergy();
	
	
	
	public int getEnergy() {
		return energy;
	}
	
	
	
	
	
	
	
}
