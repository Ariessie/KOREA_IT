package ex1_inheritance;

public class ExtendsMain {
public static void main(String[] args) {
	
	
	
	/*
	 
	 [ ��� ]
	 : ��Ӱ����� ��ü���� �ڽ�Ŭ������ �θ� ���� �Ӽ��� ������� �����ٰ� ����� �� �ִ�.  
	 : �ƹ��� ��Ӱ����� ��ü�� �θ� private���� ������ �Ӽ����� �ڽĵ� ������ �Ұ�
	 : ��Ӱ����� ��ü������ �θ� Ŭ������ �ڽ��� �Ӽ��� ������� �����ٰ� ����� �� ����.
	 : �ڹٴ� ���ϻ�� �������ν�, �� Ŭ�������� �������� �θ� ��ӹ��� �� ����.
	  
	  [�޼����� �������̵� ]
	  : '�޼����� ������'�� �ǹ̸� ������, ��Ӱ����� ��ü����
	    �ڽ��� �θ��� �޼��带 ��������, ������ �ڽ� ������ �°� ������ �ؼ� �� �� �ֵ��� �� ��. 
	  
	 */
	
	
	
	
	Child c1 = new Child();
	
	//��Ӱ����� ��ü���� �ڽ�Ŭ������ �θ� ���� �Ӽ��� ������� �����ٰ� ����� �� �ִ�.
	
//	System.out.println(c1.money); 
	System.out.println(c1.str);
	
	
	
	if(c1 instanceof Parent) {
		 System.out.println("c1�� Parent�� instance�� ����");
	}
	
	System.out.println("-------------------------");
	
	
	
	Parent p1 = new Parent();
	System.out.println(p1.str);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
