package ex1_computer;

public class Computer {

	/*
	  	
	  	#day 9
	  	
	   	��ǻ�͸� �뷮���� �ϱ� ���� ���赵�� ����� �۾�
	   	
	   	[ Ŭ������ ������� ]
	 	  1. �Ӽ� (����, ���)
	  	  2. �޼��� (�Լ�/���)
	  	  
	    [ ���� ������ ]
	  	1. public: ���� ������Ʈ ���� ��� Ŭ�������� ����� �㰡
	  	2. private: ���� Ŭ���������� ����� �㰡
	  	3. default: ���� ��Ű�� ���� ��� Ŭ�������� ����� �㰡
	  	4. protected: ��Ӱ����� ��ü�鿡�Ը� ����� �㰡
	  	 
	  	
	  	  ����������  ��ȯ��  �޼����    (����, �Ķ����){�޼��� ����}
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
