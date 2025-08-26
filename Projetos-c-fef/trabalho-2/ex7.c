#include <stdio.h>

int main() {
    int inputNum, contInter = 0, contFora = 0;

    for(int i = 0; i < 20; i++) {
        printf("Digite um número: \n");
        scanf("%d", &inputNum);

        if(inputNum >= 10 && inputNum <= 20) {
            contInter++;
        } else {
            contFora++;
        }
    }

    printf("Dentro do intervalo: %d\n", contInter);
    printf("Fora do intervalo: %d\n", contFora);

    return 0;
}