package ex4_super;

public class Child extends Parent {
	//super : �θ�Ŭ����
	
	
	public Child() {
		super(10);
		
		System.out.println("�ڽ�Ŭ���� ������");
	}
	
	@Override
	public int getResult(int n1, int n2) {
		
		//super.getResult(n1, n2);//�θ�Ŭ������ getResult()�޼��� ȣ��
	
	return n1+n2;
	
	}
	
	public void setNum(int num) {
		super.num=num; //super.num : �θ�Ŭ������ num����
	}
	
	
}
