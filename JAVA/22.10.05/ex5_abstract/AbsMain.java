package ex5_abstract;

public class AbsMain {

	public static void main(String[] args) {
		
		
		AbsChild ac = new AbsChild();
		ac.setValue(10);
		
		//�߻�Ŭ������ ��ü ������ �ν��Ͻ��� ���������� ���� �� ����
		AbsParent ap = new AbsParent() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		

	}

}
