#include <stdio.h>
#include <locale.h>

int main () {
    setlocale(LC_ALL, "Portuguese");

    float num;

    printf("Numero: ");
    scanf("%f", &num);

    if (num > 20) {
        printf("É maior que 20!");
    } else {
        printf("É menor que 20!");
    }

    return 0;

}