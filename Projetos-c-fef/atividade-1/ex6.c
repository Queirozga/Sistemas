#include <stdio.h>

int main(){

    float fachada, lateral, area;

    printf("Informe o tamanho da fachada e da lateral(separadas por um espaço)");
    scanf("%f%f", &fachada, &lateral);
    area = fachada * lateral;
    printf("A área do terreno é: %.2f", area);
}
