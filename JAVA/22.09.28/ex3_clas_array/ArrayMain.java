package ex3_clas_array;

public class ArrayMain {

	public static void main(String[] args) {
		
		
		
		
		
		
		//FriendŬ������ ����� 2��¥�� ����'��' Ȯ��
		
		Friend[] fr = new Friend[2];
		
		//������ 2���� ���� ����� name, age�� �޸𸮿� Ȯ��
//		fr[0] =new Friend();
//		fr[1] =new Friend();
		
		for (int i = 0; i < fr.length; i++) {
			fr[i] = new Friend();
		}
		
		fr[0].setName("ȫ�浿");
		fr[0].setAge(20);
		
		fr[1].setName("�ڱ浿");
		fr[1].setAge(30);

		
		for (int i = 0; i < fr.length; i++) {
			System.out.println(fr[i].getName());
			System.out.println(fr[i].getAge());
			System.out.println("--------");
		}
		
		
	}

}
