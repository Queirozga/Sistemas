#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "pt_BR.UTF-8");
	
	char nome[15], sobrenome[15];
	int idade;
	
	printf("Digite seu nome: ");
	scanf("%s", nome);
	printf("Digite seu sobrenome: ");
	scanf("%s", sobrenome);
	printf("digite sua idade: ");
	scanf("%d", &idade);
	printf("Ola %s, você tem %d anos!", nome, idade);
	
	return 0;
}
