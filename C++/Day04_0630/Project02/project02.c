#include <stdio.h>
int main(void)
{
	/*
		Example 02
		num1,num2 �Է¹޾� num1-num2�� 0���� ũ�� 
	*/
	int num1, num2,maxNum;
	scanf_s("%d %d", &num1, &num2);

	if (num1 - num2 > 0)
		maxNum = num1;
	else
		maxNum = num2;

	printf("%d�� %d �� ū ���� %d�Դϴ�\n",num1,num2, maxNum);

	return 0;
}