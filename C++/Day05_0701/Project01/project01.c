#include <stdio.h>
int main(void)
{
	/*
	int sccore = 50
	switch������ 
	*/

	int score;
	scanf_s("%d", &score);

	switch (score)
	{
	case 50:
		printf("��Ÿ��\n");
		break;
	case 100:
		printf("����\n");
		break;
	case 0:
		printf("����\n");
		break;
	}

	if (score == 50)
		printf("��Ÿ��\n");
	else if (score == 100)
		printf("����\n");
	else if (score == 0)
		printf("����\n");
	else
		printf("�̵����� �ƴ�\n");
	return 0;
}