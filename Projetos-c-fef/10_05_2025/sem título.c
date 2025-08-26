#include <stdio.h>

int main(){
	
	int soma = 0, numeros[10], media = 0;
	for(int i = 0; i < 10; i++){
		printf("Digite um número: ");
		scanf("%d", &numeros[i]);
		soma+=numeros[i];
	} 
	
	media = soma / 10;
	printf("Média: %d", media);
	return 0;
}

