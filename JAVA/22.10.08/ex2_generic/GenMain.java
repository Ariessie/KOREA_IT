package ex2_generic;

public class GenMain {

	public static void main(String[] args) {
	
		
		GenTest<String> v1 = new GenTest<String>(); 
		v1.setValue("String ������");
		String s = v1.getValue();
		
		System.out.println(s);
		
		
		
		//���ʸ�Ÿ���� int, char�� �⺻�ڷ����� ������ �� ����.
		//�׷��Ƿ� �ݵ�� Ŭ���� �������� �����ؾ� ���ʸ����� ���� ����
		
		GenTest<Integer> v2 = new GenTest<Integer>();
		
		v2.setValue(100);
		int n = v2.getValue();
		
		GenTest<Character> v3 = new GenTest<Character>();
		v3.setValue('a');
		System.out.println(v3.getValue());
		
		GenTest<Float> v4 = new GenTest<Float>();
		v4.setValue(3.15f);
		
		
		
	}

}
