#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void)
{
	char p = 'P';
	double marathon = 42.195;

	printf("%c , %.3f\n", p, marathon);
	// ���� �޾Ƽ� ����ϱ�

	int i = 10; 
	int inputNum1, inputNum2;
	scanf_s("%d %d", &inputNum1, &inputNum2);
	printf("%d %d", inputNum1, inputNum2);

	
	return 0;
}