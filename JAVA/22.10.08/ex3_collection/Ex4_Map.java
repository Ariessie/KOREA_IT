package ex3_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_Map {

	public static void main(String[] args) {
		/*
		  
		  id : hong
		  pw : 3333
		  ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		  
		  id : john
		  pw : 1111
		  id�� �������� �ʽ��ϴ�.
		  
		  id: hong
	      pw: 2222
		    �α��� ����!!
		    
		    
		    
		 */
		
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kim", 1111);
		map.put("hong",2222);
		map.put("lee",3333);
		map.put("park",4444);
		
		boolean idres = true;
		boolean pwres = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id: ");
		String id = sc.next();
		System.out.print("pw: ");
		int pw = sc.nextInt();
		
		
	
		if (!map.containsKey(id)) {
			System.out.println("���̵� �������� �ʽ��ϴ�");
		} else {
			
			if ( map.get(id) == pw ) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			
		}
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
