package ex6_static;

public class StaticTest {

	
	
	String str1 = "�Ϲ� ��� ����";
	static String str2 = "����ƽ ����";
	
	
	public static void getString2 () {
	
		//static�޼��忡���� �Ϲ� ������ ����� �� ����.
//		str1 ="�ȳ�";
		str2 = "�ݰ���";
		//static �ż��� ���ο����� static ���������� ������ �� ����.
//		static int num =10;
	}
	
	
	
	
	public void getString () {
		//�Ϲ� �޼��忡�� static������ �Ϲݺ��� ��� ����� �� �ִ�.
		str1 = "�ȳ�";
		str2 = "�ݰ����ϴ�";
		
		int num1 = 10;
		//static Ű���带 ���� ���������� �Ϲ� �޼��忡�� ���Ұ�
//		static int num2 = 10;
	}
	
	
	
	
	
	
	
}
