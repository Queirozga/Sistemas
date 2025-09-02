package pooaula1;

import model.Cat;

public class PooAula1 {
    public static void main(String[] args) {
       
       Cat mia = new Cat("mia", 3, "female", 13, "white");
       Cat tom = new Cat();
       tom.setName("tom");
       tom.setAge(4);
       tom.setGender("male");
       tom.setWeight(15);
       tom.setColor("black");
           
       System.out.println("O nome do gato é: "+ tom.getName());
        
    }
    
}

/* Da p criar métodos com o mesmo nome se a combinação de parâmetros for diferente 
 Nome do método + Conjunto de parâmetros == Assinatura do método.
 O que diferência o método de mesmo nome: sequência de tipo de parâmetros.
Por ex: pode ter um Cat com 4 param de String, se eu criar outro com o quinto sendo int,
vai ser diferente, e se eu trocar o int para o primeiro param, vai ser diferente também
*/

