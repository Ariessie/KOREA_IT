#include <stdio.h>
int main(void)
{
	/*
		Example 1.
		���� 2���� �Է¹ް�, �� �߿� ū ���� ���
	*/ 
	int num1, num2;
	scanf_s("%d %d", &num1, &num2);
	
	if (num1 > num2)
		printf("%d\n", num1);

	if (num2 > num1)
		printf("%d\n", num2);
	
	return 0;
}