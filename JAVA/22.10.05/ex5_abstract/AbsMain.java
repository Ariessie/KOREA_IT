package ex5_abstract;

public class AbsMain {

	public static void main(String[] args) {
		
		
		AbsChild ac = new AbsChild();
		ac.setValue(10);
		
		//추상클래스는 객체 생성시 인스턴스를 직접적으로 가질 수 없다
		AbsParent ap = new AbsParent() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		

	}

}
