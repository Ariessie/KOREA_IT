package ex1_string;

public class Ex1_String {

	public static void main(String[] args) {
		/*
		  
		  #day 8
		  
		  [ String Ŭ���� ]
		   : String Ŭ������ �� ���� Ư¡�� ������ �ִ�.
		   1) ��ü�������� �ΰ��� (�Ͻ���, �����)
		   -> Ŭ������ ���ؼ� ����� ������
		   2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�. (�Һ��� Ư¡)
		 
		   * == �����ڴ� �Ϲ� ������ ���� ���� ���� �������� ���ϴ� �ڵ�����, 
		               ��ü���� �񱳿����� �ּҰ� ���� �ڵ�� ���ȴ�.
		   * equals() �� String�� ���� ���ϴ� �޼���(���)
		  
		  
		  
		  < �Ͻ��� ��ü ���� >
		   : �� 	String ��ü�� ������ ���� ���� ��� �ռ� �����Ǵ� ��ü �ּҸ� �����ϴ� ����
		  
		      
		 < ����� ��ü ���� >
		  new�� ���� ��������� ��� Ŭ������ ����� ��ü ����
		 
		 
		  [ StringŬ������ �޼��� ] *Ex2_String_Method
		  
		 : �޼���� ��� �۾��� �����ϱ� ���� ��ɹ��� ����
		 
		 [ WrapperŬ������ ���� ]
		  Integer => int
		  Character => char
		  Boolean => boolean
		  Byte  => byte
		  Short => short
		  Float => float
		  Double => double
		  Long => long
		 
		 
		 
		 */
		
		//�Ͻ���
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		// 
		if (s3 == s4) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�");
		}
		
		
		//string Ŭ������ ���� ���غ���
		
		if (s1.equals( s3)) {
			System.out.println("���� ����");
		}
		
		
		System.out.println("string�� �Һ��� Ư¡");
		
		String greet = "ȫ�浿";
		greet += "�ȳ�";
		System.out.println(greet);

		
		
		
		
		
		
		
		
	}

}
