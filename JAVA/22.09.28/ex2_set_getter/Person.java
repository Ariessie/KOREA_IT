package ex2_set_getter;

public class Person {

	private String name;
	private int age;
	
	
	
	
	public void setProperty(String name, int age) {
		//this : ���� Ŭ������ �ǹ�(person)
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
