#include <stdio.h>
int main(void)
{
	/*
		Day 2
		> ���� : ���α׷��� ������ �Ǵ� ���� �޸𸮿� ������ �Ҵ� �޾� �����͸� �־�δ� ��

		> ���� ���� + �ʱ�ȭ
		> int ( ������ ������ �� �ִ� ����Ÿ��)
		ZB. int number; (����) number = 7; (�ʱ�ȭ) ( '=' ���� ������)
		
		compile (������)
		> �ҽ��ڵ带 ������ �Ѵ�. 
		> ����� �����ϴ� �� ��谡 �����ϴ� ���� �����ϴ� ��.
		> ���α׷��� ��� ( ����� �����ϴ� ���) 
		> ����

		�����(build)
		> ������ + ����� + ����
		> �� �� �ϳ��� �����ϸ� ��������� ����. 
		> �����Ϸ�, �����

		�����(debugging)
		> de- �����ϴ�, ���ִ�
		> ���׸� ���ִ� ��

		�ڷ���
		> �������� ����, ������ �������� ������ ����

		char
		short,int, long, long long
		float, double, long double

	*/
	int num; // ����
	num = 10; //�ʱ�ȭ
	int num2 = 17; // ����� �ʱ�ȭ
	int num3, num4;

	int a = 100;
	int b = 300;
	printf("Hello World\n");
	printf("%d\n", a);
	printf("%d\n", b);

	char  c = 'C';
	int i = -123;
	double d = 1.23;

	printf("char c�� %c�Դϴ�\n", c);
	printf("int i�� %d�Դϴ�\n",i);
	printf("double d�� %.2f�Դϴ�\n",d);

	int num1 = 5;
	num1 = 7;
	num1 = 100;
	num2 = 200;
	num1 = num2;

	/*
	ex. temp�� �̿��ؼ� number1�� ���� number2�� ���� �ٲٰ� ������� Ȯ�����ּ���.
	*/
	int number1, number2,temp=0; //1111
	number1 = 1111;
	number2 = 2222;

	temp = number1;
	number1 = number2;
	number2 = temp;

	printf("number 1 : %d\n", number1);
	printf("number 2 : %d\n", number2);


	return 0; //���α׷� ���Ḧ ����
}