#include <stdio.h>

int main(){
	
	int numero[8], maior = 0, menor = 0, positMaior = 0, positMenor = 0;
	
		printf("Digite um número: ");
		scanf("%d", &numero[0]);
		maior = numero[0];
		menor = numero[0];
		
	for(int i = 1; i < 8; i++){
		printf("Digite um número: ");
		scanf("%d", &numero[i]);
		
		if(numero[i] > maior){
			 maior = numero[i];
			 positMaior = i;
		}
		if(numero[i] < menor){
			menor = numero[i];
			positMenor = i;
		}
	}
	
	printf("Maior: %d Posição: %d \n", maior, positMaior);
	printf("Menor: %d Posição: %d \n", menor, positMenor);
	
	return 0;
}

