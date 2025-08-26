#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "pt_BR.UTF-8");
		
	char nome[20], inst[20];
	
	printf("Qual seu nome: ");
	scanf("%s", nome);
	printf("Qual o nome da instituição: ");
	scanf("%s", inst);
	printf("Olá %s! Seja bem-vindo(a) à %s!!!", nome, inst);
	
	return 0;
}

