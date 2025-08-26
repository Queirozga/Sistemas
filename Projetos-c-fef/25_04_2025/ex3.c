#include <stdio.h>

int main() {
	
	int input, soma;
	
	while (input != 0) {
		printf("Digite um valor: ");
		scanf("%d", &input);
		soma += input;
	}
	printf("Soma: %d\n", soma);
	return 0;
}

