#include <stdio.h>

int main(){
		
	int array[20], ver, existe, posicao, total = 20;
	
	for(int i = 0; i < total; i++){
		printf("Digite um número: ");
		scanf("%d", &array[i]);
	}
	
	printf("Digite um Num verificador: ");
	scanf("%d", &ver);
	
	for(int i = 0; i < total; i++){
		if(array[i] == ver){
		 existe = 1;
		 posicao = i;
		 break;
		};
	}
	
	if(existe == 1) printf("Esse número existe! Posição: %d", posicao);
	if(existe == 0) printf("Esse número não existe!");
	
	return 0;
}

