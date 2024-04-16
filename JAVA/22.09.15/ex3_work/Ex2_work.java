package ex3_work;

public class Ex2_work {

	public static void main(String[] args) {
		/* 과수원이 있다
			배, 사과 오렌지를 키우고 있는데 하루 생상량은 각가
			5,7,5개다.
			과수원에서 하루에 생산되는 과일의 총 갯수를 출력하고, 
			한시간에 몇개의 과일이 만들어 지는 지 전체 과일의 평균 생산 갯수를 출력.
			
			단, 과일의 갯수와 총 합을 담는 변수는 정수형으로
			평균 생산 갯수를 저장하는 변수는 float타입으로 만들 것
			
			하루생산량 : 17
			시간당 평균 : 0.8XXXXX
	
*/
	
		int pe = 5;
		int ap = 7;
		int or = 5;
		 
		int graSum = pe+ap+or;
		System.out.println("과수원 하루 생상량 : "+graSum);
		
//		#1
		 float av = graSum / 24F;
		System.out.println("시간당 평균: "+av);
		
	// #2
		float avg = (float)graSum / 24F;
		System.out.println("시간당 평균: "+avg);
		
		
		
		
		
	}

}
