package ex2_arraylist;

import java.util.ArrayList;

public class UserArray {

	public static void main(String[] args) {


		ArrayList<User> arr = new ArrayList<>();
		
		User u1 = new User();
		u1.setAge(20);
		u1.setName("È«±æµ¿");

		User u2 = new User();
		u2.setAge(30);
		u2.setName("ÀÓ²©Á¤");
	
		arr.add(u1);
		arr.add(u2);
	
		for (int i = 0; i < arr.size(); i++) {
			
			System.out.println(arr.get(i).getName());
			System.out.println(arr.get(i).getAge());
			
		}
		

	}

}
