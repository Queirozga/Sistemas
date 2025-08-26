#include <stdio.h>

int main() {
    int votos = 1, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0;
    double quantVotos = 0, votoNulo = 0, votoBranco = 0, porcentNull = 0, porcentBranco = 0;

    while(votos > 0) {
        quantVotos++;
        printf("Digite o código de voto\n");
        scanf("%d", &votos);

        if(votos == 1) voto1++;
        if(votos == 2) voto2++;
        if(votos == 3) voto3++;
        if(votos == 4) voto4++;
        if(votos == 5) votoNulo++;
        if(votos == 6) votoBranco++;
    }

    if (quantVotos > 0) {
        porcentNull = (votoNulo / quantVotos) * 100.0;
        porcentBranco = (votoBranco / quantVotos) * 100.0;
    } else {
        porcentNull = 0;
        porcentBranco = 0;
    }


    printf("Total 1: %d\n", voto1 );
    printf("Total 2: %d\n", voto2 );
    printf("Total 3: %d\n", voto3 );
    printf("Total 4: %d\n", voto4 );
    printf("Total Nulos: %.0f\n", votoNulo );
    printf("Total Brancos: %.0f\n", votoBranco );
    printf("%% Votos nulos sobre total: %.2f\n", porcentNull);
    printf("%% Votos brancos sobre total: %.2f\n", porcentBranco);

    return 0;
}