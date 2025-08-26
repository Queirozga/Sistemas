#include <stdio.h>

int main() {
    double idade;
    double somaIdd = 0.0;
    double cont = 0.0;
    double media;

    printf("Qual a sua idade: \n");
    scanf("%f", &idade);

    while(idade > 0) {
        cont++;
        somaIdd += idade;
        printf("Qual a sua idade: \n");
        scanf("%f", &idade);
    }

    if (cont > 0.0) {
        media = somaIdd / cont;
        printf("Media: %.2f\n", media);
    } else {
        printf("Media: NaN\n");
    }

    return 0;
}