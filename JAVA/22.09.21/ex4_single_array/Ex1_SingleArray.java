package ex4_single_array;

public class Ex1_SingleArray {

	public static void main(String[] args) {
		
		/*
		  #day 6
		   
	 	  [ label ] *Ex1_label_break
		 	: 가장 가까운 반복문만을 제어하는 break, continue와 달리
		 	   한 번에 두 개 이상의 반복문을 제어할 수 있도록 하는 키워드
		  
		   [ 배열 ] 
		 	: '같은 자료형끼리 모아둔 하나의 묶음'이다.
		 	: 효율적인 자료관리를 위해 반드시 필요
		 	
		 	자원을 편하게 관리하고 제어하기 위해 배열을 사용
		 	1) 배열 선언
		 		int[] arr;
		 	2) 배열 생성
		 		arr = new int [4]; -> 방 4개짜리 집인인데 그 방에는 정수만 들어갈 수 있음
		 	3) 배열 초기화
		 	 	arr[0] = 100;
		 	
		 	4) 배열의 선언과 생성을 한번에
		 	int[] arr = new int[4]; 
		 	
		   > arr.length는 index의 수                                                                          
		 	
		*/
			int su1 = 10;
			int su2 = 20;
			int su3 = 30;
			int su4 = 40;
			
			
			//배열
			
			int[] arr ;
			arr = new int [4];
			arr[0] = 100;
			//배열의 존재하지 않는 index에 값을 추가하거나 변경할 수 없다.
			// arr[4] = 100;
			
//			System.out.println(arr[i]); //특정  index의 값만 꺼내서 사용 할 수 있다.
		
			for(int i =0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}//for
		
		
	}

}
