package ex1_printf;

public class Ex1_printf {

	public static void main(String[] args) {
		
		/*
		 
		 
		 
		 
		 
		 
		 
		 
		 */
		
		
		int su1 = 10;
		int su2 = 29;
		System.out.println(su1+"+"+su2+"="+(su1+su2));
		System.out.printf("%d+%d =%d\n", su1, su2, su1+su2);
		System.out.println("-----------");
		
		char blood = 'B';
		System.out.println("���� �������� "+blood+"�� �Դϴ�");
		
		System.out.printf("���� �������� %c�� �Դϴ�.\n", blood);
		
		float temp = 20.5f;
		double temp2 = 22.7;
		System.out.printf("���� ����� %.1f�� �Դϴ�.\n", temp);// %.x : �Ҽ��� x�ڸ�����
		System.out.printf("����� %f�� �Դϴ�.\n", temp2);
		
		
		String name = "����ġ";
		int age = 20;
		
		System.out.printf("���� %s�� %02d�� �Դϴ�.\n", name, age); // %02d : 2�ڸ����� �ƴϸ� �տ� 0�� �ٿ��� -> 07
		//formatter�� �ڷ��� Ÿ��
		//%d : ���� Ÿ��
		//%c : ���� Ÿ��
		//%f : �Ǽ�Ÿ��
		//%s : ���ڿ� Ÿ��
		
		
		
		
	}//main

}
