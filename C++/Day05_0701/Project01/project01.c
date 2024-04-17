#include <stdio.h>
int main(void)
{
	/*
	int sccore = 50
	switch문으로 
	*/

	int score;
	scanf_s("%d", &score);

	switch (score)
	{
	case 50:
		printf("반타작\n");
		break;
	case 100:
		printf("만점\n");
		break;
	case 0:
		printf("빵점\n");
		break;
	}

	if (score == 50)
		printf("반타작\n");
	else if (score == 100)
		printf("만점\n");
	else if (score == 0)
		printf("빵점\n");
	else
		printf("이도저도 아님\n");
	return 0;
}