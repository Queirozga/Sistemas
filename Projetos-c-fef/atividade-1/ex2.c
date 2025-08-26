#include <stdio.h>

int main(){

    float h, he, salarb, salarl;

    printf("Informe as horas trabalhadas e as horas extras(separadas por um espaço)");
    scanf("%f%f", &h, &he);
    salarb = (h * 10) + (he * 15);
    salarl = salarb * 0.9;
    printf("Salário bruto %.2f\n", salarb);
    printf("Salário líquido %.2f\n", salarl);

    return 0;
}

