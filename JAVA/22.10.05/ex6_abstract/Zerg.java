package ex6_abstract;

public class Zerg extends Unit {

	
	public Zerg(String name, int energy,boolean fly ) {
		super.energy = energy;
		super.fly = fly;
		super.name = name;
	}
	
	
	
	@Override
	public void decEnergy() {
		energy -= 10;
		
	}

	
	
	
	
	
	
	
}
