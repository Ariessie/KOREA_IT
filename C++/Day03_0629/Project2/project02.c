#include <stdio.h>
int main(void)
{
	//if��
	int a = 3;
	int b = 7;

	if (a < b) {
		printf("a�� b���� �۽��ϴ�\n");
	} else
		printf("a�� b���� Ů�ϴ�\n");

	/*
	example.
	int num  �Է¹����ð�, num�� ¦���� ¦�� ���, Ȧ���� Ȧ�� ���
	*/
	int num,left;
	scanf_s("%d", &num);

	left = num % 2;

	if (left)
		printf("Ȧ���Դϴ�\n");
	else
		printf("¦���Դϴ�\n");
	
	return 0;
}