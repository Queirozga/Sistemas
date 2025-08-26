#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"pt_BR.UTF-8");

	float salario, beneficio, dependentes, meses, bonus;
	
	printf("Salario: ");
	scanf("%f", &salario);
	printf("Benefício: ");
	scanf("%f", &beneficio);
	printf("Dependentes: ");
	scanf("%f", &dependentes);
	printf("Quantos meses você trabalhou: ");
	scanf("%f", &meses);
	bonus = ((salario + beneficio) / (dependentes + 1)) * meses;
	printf("O bonus final é: %f", bonus);
	
	return 0;
}

