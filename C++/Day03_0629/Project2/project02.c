#include <stdio.h>
int main(void)
{
	//if문
	int a = 3;
	int b = 7;

	if (a < b) {
		printf("a가 b보다 작습니다\n");
	} else
		printf("a가 b보다 큽니다\n");

	/*
	example.
	int num  입력받으시고, num이 짝수면 짝수 출력, 홀수면 홀수 출력
	*/
	int num,left;
	scanf_s("%d", &num);

	left = num % 2;

	if (left)
		printf("홀수입니다\n");
	else
		printf("짝수입니다\n");
	
	return 0;
}