#include <stdio.h>

int main (){
    
    float frango, preco;
    
    printf("Informe a quantidade de frangos da sua granja:");
    scanf("%f", &frango);
    preco = frango * 7.50; /*somei 4 + 3.50*/
    printf("Preço total: %.2f", preco);

    return 0;
}

