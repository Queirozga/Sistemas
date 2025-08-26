#include <stdio.h>

int main() {
    
    int filhos;
    float salar = 0.0, somaS = 0.0, somaF = 0.0, contP = 0.0, contF = 0.0, mediaS = 0.0, mediaF = 0.0, maiorS = 0.0, pobres = 0.0, porcentPessoas = 0.0;
    

    printf("Salário: \n");
    scanf("%lf", &salar);
    printf("Filhos: \n");
    scanf("%d", &filhos);

    maiorS = salar; 

    while (salar > 0) {
        contP++;
        contF++; 

        somaS += salar;     
        somaF += filhos;   

        if(salar > maiorS) {
            maiorS = salar; 
        }
        if(salar <= 150) {
            pobres++;      
        }

        printf("Pessoas adicionadas: %.0f\n", contP); 

        printf("Salário: \n");
        scanf("%lf", &salar);

        if (salar > 0) {
            printf("Filhos: \n");
            scanf("%d", &filhos);
        }
    }

    if (contP > 0) { 
        mediaS = somaS / contP;
        mediaF = somaF / contF;
        porcentPessoas = (pobres / contP) * 100.0;
    } else {

        mediaS = 0.0;
        mediaF = 0.0;
        porcentPessoas = 0.0;
    }
    
    printf("Média salario: %.2f\n", mediaS);
    printf("Média filhos: %.2f\n", mediaF);
    printf("Maior salario: %.2f\n", maiorS); 
    printf("%% Salario menor que R$150: %.2f%%\n", porcentPessoas); 
        
    return 0;
}