#include <stdio.h>

int main() {

    int idade, i, cont2 = 0;
    float peso, altura, media, somaidd = 0.0, pessoa = 0.0, porcent = 0.0, cont3 = 0.0, cont4 = 0.0;

    for(i = 0; i < 10; i++) {
        pessoa++;
        printf("Pessoa número: %.0f\n", pessoa);

        printf("Idade: \n");
        scanf("%d", &idade);

        somaidd += idade; 

        printf("Peso: \n");
        scanf("%f", &peso); 
        printf("Altura: \n");
        scanf("%f", &altura); 

        if(peso > 90 && altura < 150) {
            cont2++;
        }

        if(altura > 190) {
            cont3++;
        }

        if(idade >= 10 && idade <= 30) {
            cont4++;
        }
    }

    if (pessoa > 0) {
        media = somaidd / pessoa;
    } else {
        media = 0.0;
    }

    if (cont3 > 0) { 
        porcent = (cont4 / cont3) * 100.0;
    } else {
        porcent = 0.0; 
    }
    
    printf("Calculo 1: %.2f\n", media);       
    printf("Calculo 2: %d\n", cont2);           
    printf("Calculo 3: %.2f%%\n", porcent);   

    return 0;
}