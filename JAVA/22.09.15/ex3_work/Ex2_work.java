package ex3_work;

public class Ex2_work {

	public static void main(String[] args) {
		/* �������� �ִ�
			��, ��� �������� Ű��� �ִµ� �Ϸ� ������ ����
			5,7,5����.
			���������� �Ϸ翡 ����Ǵ� ������ �� ������ ����ϰ�, 
			�ѽð��� ��� ������ ����� ���� �� ��ü ������ ��� ���� ������ ���.
			
			��, ������ ������ �� ���� ��� ������ ����������
			��� ���� ������ �����ϴ� ������ floatŸ������ ���� ��
			
			�Ϸ���귮 : 17
			�ð��� ��� : 0.8XXXXX
	
*/
	
		int pe = 5;
		int ap = 7;
		int or = 5;
		 
		int graSum = pe+ap+or;
		System.out.println("������ �Ϸ� ���� : "+graSum);
		
//		#1
		 float av = graSum / 24F;
		System.out.println("�ð��� ���: "+av);
		
	// #2
		float avg = (float)graSum / 24F;
		System.out.println("�ð��� ���: "+avg);
		
		
		
		
		
	}

}
