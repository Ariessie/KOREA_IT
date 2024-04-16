package ex1_computer;

public class Computer {

	/*
	  	
	  	#day 9
	  	
	   	컴퓨터를 대량생산 하기 위한 설계도를 만드는 작업
	   	
	   	[ 클래스의 구성요소 ]
	 	  1. 속성 (변수, 멤버)
	  	  2. 메서드 (함수/기능)
	  	  
	    [ 접근 제한자 ]
	  	1. public: 같은 프로젝트 내의 모든 클래스에게 사용을 허가
	  	2. private: 현재 클레스에서만 사용을 허가
	  	3. default: 같은 패키지 내의 모든 클래스에게 사용을 허가
	  	4. protected: 상속관계의 객체들에게만 사용을 허가
	  	 
	  	
	  	  접근제한자  반환명  메서드명    (인자, 파라미터){메서드 영역}
	 ex) public   void getInfo (  ) {}
	  
	 */
		private String company = "samsung";
		int hdd =512;
		int ram = 16;
		float cpu = 2.5f;
		String color = "white";
		
	
		public void getInfo () {
			System.out.println("hdd: "+hdd);
			System.out.println("ram: "+ram);
			System.out.println("cpu: "+cpu);
			System.out.println("color: "+color);
			System.out.println("------------");
		}
	
	
	
}
