#include <stdio.h>
#include <locale.h>


int main(){
	setlocale(LC_ALL, "pt_BR.UTF-8");
	
	char nome[15], disciplina[15], data[10];
	
	printf("Qual seu nome: ");
	scanf("%s", nome);
	printf("Qual o nome da disciplina: ");
	scanf("%s", disciplina);
	printf("Qual a data: ");
	scanf("%s", data);
	printf("***************************************************\n");
	printf("Avaliação de Lógica\n");
	printf("***************************************************\n");
	printf("Nome do aluno: %s \nDisciplina: %s \nData: %s \n", nome, disciplina, data);

	return 0;
}

