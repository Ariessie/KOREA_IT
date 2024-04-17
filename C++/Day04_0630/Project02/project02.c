#include <stdio.h>
int main(void)
{
	/*
		Example 02
		num1,num2 입력받아 num1-num2가 0보다 크면 
	*/
	int num1, num2,maxNum;
	scanf_s("%d %d", &num1, &num2);

	if (num1 - num2 > 0)
		maxNum = num1;
	else
		maxNum = num2;

	printf("%d과 %d 중 큰 수는 %d입니다\n",num1,num2, maxNum);

	return 0;
}