package ex1_string;

public class Ex2_String_Method {

	public static void main(String[] args) {
		
		
		
		String name = "Hong Gil Dong";
		
		int index = name.length();
		System.out.println("���ڿ� name�� ����: " + index);
		
		index = name.indexOf('g'); //Ư�� ���ڸ� �߰����� ���ߴٸ� -1�� ��ȯ
		System.out.println("�� ó�� �߰��� ���� g�� ��ġ: "+index);
		
		
		index = name.indexOf("Gill");
		System.out.println("���� Gill�� ���� ��ġ: "+index);
		
		index = name.lastIndexOf('o');
		System.out.println("������ ���� o�� ��ġ: "+index);
		
		char c = name.charAt(5);
		System.out.println("������ 5��° ��ġ�� ����: "+c);
		
		
		String a = name.substring(0); //ù��° ���� ����
		a = name.substring(0,4); //ù��°���� 4��° ���ڱ ������ ���� ����
		
		
		String fruit1 = "apple";
		String fruit2 = "Apple";
		
		if (fruit1.equals(fruit2)) { //equals�� ��ҹ��ڸ� �����Ͽ� ���� ���Ѵ�.
			System.out.println("���� ����");
		}else {
			System.out.println("���� �ٸ���");
		}
		
		//equalsIgnoreCase�� ��ҹ��ڸ� �����ϰ� �ܾ ��ġ�ϸ� true�� ��ȯ
		if (fruit1.equalsIgnoreCase(fruit2)) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� �ٸ�");
		}
		
		
		String myId = " jyh ";
		String result = myId.trim();
		if (myId.equals("jyh")) {
			System.out.println("�α��� ����!");
		}
		
		//���������� ���ڿ� ("10")�� ���� ������ �ٲ��ִ� �޼���
		String number = "10";
		
		int n = Integer.parseInt(number);
		System.out.println(n+10);
		
		
		
		
	}

}
