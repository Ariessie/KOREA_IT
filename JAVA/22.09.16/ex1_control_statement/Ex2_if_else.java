package ex1_control_statement;

public class Ex2_if_else {

	public static void main(String[] args) {
		//if-else ��
		
		int n = 49;
		String str = "";
		
		if(n++ >= 50) {
			str = "n�� 50�̻��� ��"; 
		} else{
			//if�� ���ǽ��� ������ �� �ݵ�� ȣ��Ǵ� ����
			str = "n�� 50�̸��� ��";
		}
		System.out.println(str);
		System.out.println("---------");
		
		char gender = '��';
		
		if (gender == '��') {
			System.out.println("������ ����.");
		}else {
			System.out.println("������ �ȳ�");
		}
		
		
		
		
		
	}

}
