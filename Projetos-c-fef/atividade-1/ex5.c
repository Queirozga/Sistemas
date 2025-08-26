#include <stdio.h>

int main(){

    float preco, pagamento, gaso;

    printf("Indique o preço do litro da gasolina e quanto você quer pagar");
    scanf("%f%f", &preco, &pagamento);
    gaso = pagamento / preco;
    printf("Litros de gasolina possíveis de se colocar: %.1f", gaso);

    return 0;
}