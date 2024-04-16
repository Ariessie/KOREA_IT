package ex3_clas_array;

public class ArrayMain {

	public static void main(String[] args) {
		
		
		
		
		
		
		//Friend클래스가 저장될 2개짜리 공감'만' 확보
		
		Friend[] fr = new Friend[2];
		
		//실제로 2개의 방을 만들어 name, age를 메모리에 확보
//		fr[0] =new Friend();
//		fr[1] =new Friend();
		
		for (int i = 0; i < fr.length; i++) {
			fr[i] = new Friend();
		}
		
		fr[0].setName("홍길동");
		fr[0].setAge(20);
		
		fr[1].setName("박길동");
		fr[1].setAge(30);

		
		for (int i = 0; i < fr.length; i++) {
			System.out.println(fr[i].getName());
			System.out.println(fr[i].getAge());
			System.out.println("--------");
		}
		
		
	}

}
