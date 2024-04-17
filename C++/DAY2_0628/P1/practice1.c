#include <stdio.h>
int main(void)
{
	/*
		Day 2
		> 변수 : 프로그램이 실행이 되는 동안 메모리에 공간을 할당 받아 데이터를 넣어두는 것

		> 변수 선언 + 초기화
		> int ( 정수를 다음을 수 있는 변수타입)
		ZB. int number; (선언) number = 7; (초기화) ( '=' 대입 연산자)
		
		compile (컴파일)
		> 소스코드를 컴파일 한다. 
		> 사람이 이해하는 언어를 기계가 이해하는 언어로 번역하는 것.
		> 프로그래밍 언어 ( 사람이 이해하는 언어) 
		> 기계어

		빌드란(build)
		> 컴파일 + 디버깅 + 실행
		> 이 중 하나라도 실패하면 빌드오류가 난다. 
		> 컴파일러, 디버거

		디버깅(debugging)
		> de- 제거하다, 없애다
		> 버그를 없애는 것

		자료형
		> 데이터의 형태, 변수의 형태이자 변수의 형태

		char
		short,int, long, long long
		float, double, long double

	*/
	int num; // 선언
	num = 10; //초기화
	int num2 = 17; // 선언과 초기화
	int num3, num4;

	int a = 100;
	int b = 300;
	printf("Hello World\n");
	printf("%d\n", a);
	printf("%d\n", b);

	char  c = 'C';
	int i = -123;
	double d = 1.23;

	printf("char c는 %c입니다\n", c);
	printf("int i는 %d입니다\n",i);
	printf("double d는 %.2f입니다\n",d);

	int num1 = 5;
	num1 = 7;
	num1 = 100;
	num2 = 200;
	num1 = num2;

	/*
	ex. temp를 이용해서 number1의 값과 number2의 값을 바꾸고 출력으로 확인해주세요.
	*/
	int number1, number2,temp=0; //1111
	number1 = 1111;
	number2 = 2222;

	temp = number1;
	number1 = number2;
	number2 = temp;

	printf("number 1 : %d\n", number1);
	printf("number 2 : %d\n", number2);


	return 0; //프로그램 종료를 뜻함
}