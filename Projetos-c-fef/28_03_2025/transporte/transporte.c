#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"pt_BR.UTF-8");

	float km, vcombus, consumo, taxa, custo;
	
	printf("Qual a distância em km: ");
	scanf("%f", &km);
	printf("Qual o valor do combustivel: ");
	scanf("%f", &vcombus);
	printf("Qual o consumo em km: ");
	scanf("%f", &consumo);
	printf("Qual a taxa: ");
	scanf("%f", &taxa);
	custo = km / consumo * vcombus + taxa;
	printf("Custo total: %.2f\n", custo);
	
	return 0;
}

