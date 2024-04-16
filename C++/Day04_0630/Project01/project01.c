#include <stdio.h>
int main(void)
{
	/*
		Example 1.
		정수 2개를 입력받고, 둘 중에 큰 수를 출력
	*/ 
	int num1, num2;
	scanf_s("%d %d", &num1, &num2);
	
	if (num1 > num2)
		printf("%d\n", num1);

	if (num2 > num1)
		printf("%d\n", num2);
	
	return 0;
}