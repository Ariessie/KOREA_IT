package ex4_single_array;

public class Ex2_SingleArray {

	public static void main(String[] args) {
		// 
		
		
		char[] ch = new char[4];
		
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//JAVA
		

		
		for(int i = 0; i< ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//�迭�� ����, ����, �ʱ�ȭ �� ���� �ϱ�
		
		String[] str = {"�ȳ�","�ϼ���","�ݰ�","����"};
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
		
		System.out.println("--------------");
		
		//������ for�� (������ ����, ���� for��)
		//�ǵ������� �迭�� ��� index�� �����͸� ����ϰ��� �ϴ� �뵵�� ������� for��
		// �������� �迭�� �� index�� �����ϰų� ��� �Ұ�
		for( String s : str) {
		System.out.println(s);
		}			
			
			
			

	}

}
