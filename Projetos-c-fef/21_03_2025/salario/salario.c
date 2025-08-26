#include <stdio.h>

int main(){
	
	float hrs, valorh, valorinss, salariob, descontoinss, salariol;
	
	printf("Horas trabalhadas: ");
	scanf("%f", &hrs);
	printf("Valor das horas: ");
	scanf("%f", &valorh);
	printf("Desconto INSS em percentual: ");
	scanf("%f", &valorinss);
	salariob = hrs * valorh;
	descontoinss = salariob * (valorinss / 100);
	salariol = salariob - descontoinss;
	printf("Salário Bruto........ %10.2f\n", salariob);
	printf("Desconto INSS........ %10.2f\n", descontoinss);
	printf("Salario Líquido...... %10.2f\n", salariol);
	
	return 0;
}

