#include <stdio.h>

int main(){

    float po, agua, suco;

    printf("Quantos litros de suco você deseja fazer?");
    scanf("%f", &suco);
    po = suco * 0.2;
    agua = suco * 0.8;
    printf("Quantidade de água necessária: %.1f\n", agua);
    printf("Quantidade de pó necessária: %.1f\n", po);

    return 0;

}