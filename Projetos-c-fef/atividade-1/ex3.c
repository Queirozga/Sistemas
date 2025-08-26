#include <stdio.h>;

int main(){

    float si, sa, sf;

    printf("Informe o seu salário anterior:");
    scanf("%f", &si);
    sa = si * 1.15;
    sf = sa * 0.92;
    printf("Salário Inicial: %.2f\n", si);
    printf("Salário com aumento: %.2f\n", sa);
    printf("Novo salário com impostos: %.2f\n", sf);

    return 0;
    
}