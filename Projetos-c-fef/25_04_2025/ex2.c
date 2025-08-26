
#include <stdio.h>

int main()
{
	int num;
	
	printf("Digite um número: ");
	scanf("%d", &num);
	
	if (num >= 2) printf("Ação 1 ");
	if (num > 1) printf("Ação 2 ");
	if (num <= 1) printf("Ação 3 ");
	
	return 0;
}

