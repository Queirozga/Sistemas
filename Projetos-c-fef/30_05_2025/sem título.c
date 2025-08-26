#include <stdio.h>

int main(){
	
	int matriz [4][4], soma = 0, cont = 0, maiorValor = 0;
	int menorValor = 0, auxValor = 0, positMaiorL, positMaiorC, positMenorL, positMenorC;
	float media = 0;
	
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			cont++;
			printf("Digite o valor da posição [%d][%d]", i, j);
			scanf("%d", &matriz[i][j]);
			
			auxValor = matriz[i][j];
			
			
			if(i == 0 && j == 0) {
				maiorValor = menorValor = auxValor;
				positMaiorC = positMaiorL = 0;
				positMenorC = positMenorL = 0;
			}
			
			if(auxValor > maiorValor) {
				maiorValor = auxValor;
				positMaiorL = i;
				positMaiorC = j;
			}
			
			if(auxValor	< menorValor) {
				menorValor = auxValor;
				positMenorL = i;
				positMenorC = j;
			}
			soma += matriz[i][j];
			
			
			
		}
	}
	
	media = soma / cont;
	
	for(int i = 0; i<4; i++){
		for(int j = 0; j<4; j++){
			printf("%d ", matriz[i][j]);
		}
		printf("\n");
	}
	
	printf("Soma: %d\n", soma);
	printf("Media: %.0f\n", media);
	printf("Maior %d --- Posição: %d, %d\n", maiorValor, positMaiorL, positMaiorC);
	printf("Menor %d --- Posição: %d, %d\n", menorValor, positMenorL, positMenorC);
	
	return 0;
}

