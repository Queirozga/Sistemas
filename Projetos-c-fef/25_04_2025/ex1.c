#include <stdio.h>

int main()
{
	
	int anos;
	float salario, abono;
	
	
	printf("Salario: ");
	scanf("%f", &salario);
	printf("Anos na empresa: ");
	scanf("%d", &anos);
	
	if (anos < 1) {
		abono = 0;
	} else if (anos >= 1) {
		abono = salario * 0.1;
	} else{
		abono = salario * 0.25;
	}
	
	printf("Abono: %.2f", abono);
	
	return 0;
}
