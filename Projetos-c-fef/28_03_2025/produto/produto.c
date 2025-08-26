#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"pt_BR.UTF-8");

	float produto, total;
	
	printf("Valor produto: ");
	scanf("%f", &produto);
	total = ((produto * 1.12) - produto * 0.08) + 5;
	printf("O valor final é: %.2f\n", total); 
	return 0;
}

