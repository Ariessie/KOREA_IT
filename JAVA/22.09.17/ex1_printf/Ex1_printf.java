package ex1_printf;

public class Ex1_printf {

	public static void main(String[] args) {
		
		/*
		 
		 
		 
		 
		 
		 
		 
		 
		 */
		
		
		int su1 = 10;
		int su2 = 29;
		System.out.println(su1+"+"+su2+"="+(su1+su2));
		System.out.printf("%d+%d =%d\n", su1, su2, su1+su2);
		System.out.println("-----------");
		
		char blood = 'B';
		System.out.println("저의 혈액형은 "+blood+"형 입니다");
		
		System.out.printf("저의 혈액형은 %c형 입니다.\n", blood);
		
		float temp = 20.5f;
		double temp2 = 22.7;
		System.out.printf("현재 기온은 %.1f도 입니다.\n", temp);// %.x : 소수점 x자리까지
		System.out.printf("기온은 %f도 입니다.\n", temp2);
		
		
		String name = "마루치";
		int age = 20;
		
		System.out.printf("저는 %s고 %02d살 입니다.\n", name, age); // %02d : 2자리수가 아니면 앞에 0을 붙여라 -> 07
		//formatter의 자료형 타입
		//%d : 정수 타입
		//%c : 문자 타입
		//%f : 실수타입
		//%s : 문자열 타입
		
		
		
		
	}//main

}
