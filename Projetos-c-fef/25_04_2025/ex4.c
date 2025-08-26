#include <stdio.h>

int main()
{
	int tipo;
	
	printf("Digite o número genético: ");
	scanf("%d", &tipo);
	if (tipo >= 4 || tipo <= 7) tipo = 4;
	switch (tipo) {
		case 1: 
			printf("Sul");
			break;
		case 2: 
			printf("Norte");
			break;
		case 3: 
			printf("Leste");
			break;
		case 4: 
			printf("Oeste");
			break;
		default: 
			printf("Exótico");
			break;
	}
	
	return 0;
}

