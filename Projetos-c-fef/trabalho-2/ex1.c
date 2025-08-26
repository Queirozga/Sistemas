#include <stdio.h>

int main() {

    int idade, i, cont1 = 0, cont4 = 0;
    float peso, altura, cont2 = 0, mediaCalc2 = 0.0, somaCalc2 = 0, pessoas = 0, cont3 = 0, porcentCalc3 = 0.0;
    char corOlho, corCabel;

    for(i = 0; i < 2; i++) {
        pessoas++;
        printf("Pessoa número %.0f\n", pessoas);

        printf("Idade: \n");
        scanf("%d", &idade);
        printf("Peso: \n");
        scanf("%f", &peso);
        printf("Altura: \n");
        scanf("%f", &altura);

        printf("Cor dos Olhos: \n");
        scanf(" %c", &corOlho); 
        printf("Cor do cabelo: \n");
        scanf(" %c", &corCabel); 

        if(idade > 50 && peso < 60) cont1++; 

        if(altura < 150) {
            somaCalc2 += idade;
            cont2++; 
        }

        if(corOlho == 'A') cont3++; 

        if(corCabel == 'R' && corOlho != 'A') cont4++;

    }

    if (cont2 != 0) { 
        mediaCalc2 = somaCalc2 / cont2; 
    } else {
        mediaCalc2 = 0.0; 
                    
    }
    
    mediaCalc2 = somaCalc2 / cont2; 

    porcentCalc3 = (cont3 / pessoas) * 100; 

    printf("Calculo 1: %d\n", cont1 );
    printf("Calculo 2: %.2f\n", mediaCalc2 );
    printf("Calculo 3: %.2f%%\n", porcentCalc3 ); 
    printf("Calculo 4: %d\n", cont4);

    return 0;
}