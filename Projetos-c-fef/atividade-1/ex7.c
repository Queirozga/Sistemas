#include <stdio.h>

int main(){

    int cavalos, ferraduras;

    printf("Quantos cavalos você deseja equipar?");
    scanf("%d", &cavalos);
    ferraduras = cavalos * 4;
    printf("Ferraduras necessárias: %d", ferraduras);

    return 0;
}