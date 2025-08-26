#include <stdio.h>

int main() {
	
	float n1, n2, media;
	
	printf("Digite suas duas notas: ");
	scanf(" %f %f", &n1, &n2);
	media = (n1 + n2) / 2;
	printf("A sua média é: %.1f\n", media);
	
	printf("Situação: ");
	
	if (media >= 5) {
	printf("Aprovado :( \n");
	
	}
	else {
	printf("Reprovado :( \n");
	}
	
	return 0;
}

