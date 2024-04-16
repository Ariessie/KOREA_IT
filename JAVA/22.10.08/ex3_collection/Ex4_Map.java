package ex3_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_Map {

	public static void main(String[] args) {
		/*
		  
		  id : hong
		  pw : 3333
		  비밀번호가 일치하지 않습니다.
		  
		  id : john
		  pw : 1111
		  id가 존재하지 않습니다.
		  
		  id: hong
	      pw: 2222
		    로그인 성공!!
		    
		    
		    
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
			System.out.println("아이디가 존재하지 않습니다");
		} else {
			
			if ( map.get(id) == pw ) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		}
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
