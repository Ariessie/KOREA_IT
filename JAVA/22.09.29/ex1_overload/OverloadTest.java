package ex1_overload;

public class OverloadTest {

	/*
	 �޼����� �����ε�
	 �����ε��� �޼����� '�ߺ�����'��� �ϸ�, �ϳ��� Ŭ���� ������ ���� �̸���
	 ���� �޼��尡 ������ ���ǵǴ� ��Ȳ�� ���Ѵ�.
	 
	  @�����ε��� ��Ģ
	  
	  1) �����ε��� ���� �޼������ ��ҹ��ڸ� ����Ͽ� �ݵ�� �Ȱ��� �����.
	  2) �Ķ������ ������ �޶�� �Ѵ�.
	  3) �Ķ������ ������ ���� ��� Ÿ���� �޶�� �Ѵ�.
	 4) �Ķ������ ������ Ÿ���� ���Ƶ� ������ �ٸ��� �����ε����� �����ȴ�.
	  
	 
	 */
	
	public void getResult() {
		System.out.println("���ڰ� ���� �޼���");
	}
	
	public void getResult(int n) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	

	public void getResult(char n) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	}
	
	public void getResult(String s) {
		System.out.println("���ڿ��� ���ڷ� �޴� �޼���");
	}
	public void getResult(int num, String s) {
		System.out.println("������ ���ڿ��� ���ڷ� �޴� �޼���");
	}
	
	public void getResult(String s,int num) {
		System.out.println("���ڿ��� ������ ���ڷ� �޴� �޼���");
	}
	
	
	
	
	
	
	
	
	
	
}



