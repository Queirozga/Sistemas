#include <stdio.h>

int main() {

    int idade, pessoas = 0, maiorI, menorI, idadeMenorS = 0;
    float salar, somaS = 0.0, media, muiePobre = 0.0, menorS, sexo, sexoMenorS = ' ';

    printf("Idade: \n");
    scanf("%d", &idade);
    printf("Sexo: \n");
    scanf(" %c", &sexo);
    printf("Salário: \n");
    scanf("%f", &salar);

    maiorI = idade;
    menorI = idade;
    menorS = salar;

    int current_loop_condition_age = idade;

    while (current_loop_condition_age > 0) {
        pessoas++;
        printf("Pessoas adicionadas: %d\n", pessoas);

        printf("Idade: \n");
        scanf("%d", &idade);

        current_loop_condition_age = idade;

        if (idade > 0) {
            printf("Sexo: \n");
            scanf(" %c", &sexo);
            printf("Salário: \n");
            scanf("%f", &salar);

            somaS += salar;

            if (idade > maiorI) {
                maiorI = idade;
            }
            if (idade < menorI) {
                menorI = idade;
            }

            if (salar <= 200 && (sexo == 'F' || sexo == 'f')) {
                muiePobre++;
            }

            if (salar < menorS) {
                menorS = salar;
                idadeMenorS = idade;
                sexoMenorS = sexo;
            }
        }
    }

    if (pessoas > 0) {
        media = somaS / pessoas;
    } else {
        media = 0.0;
    }

    printf("Media: %.2f\n", media);
    printf("Maior idade: %d\n", maiorI);
    printf("Menor idade: %d\n", menorI);
    printf("Idade da pessoa com menor salario: %d\n", idadeMenorS);
    printf("Sexo da pessoa com menor salario: %c\n", sexoMenorS);

    return 0;
}