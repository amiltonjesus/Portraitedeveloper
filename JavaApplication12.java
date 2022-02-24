
package javaapplication12;
import java.util.*;



public class JavaApplication12 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num1, num2, num3;
       double raiz;
       
        System.out.println("Digite o primeiro numero:");
        num1 = input.nextInt();
        
        System.out.println("Digite o segundo numero:");
        num2 = input.nextInt();
        
        System.out.println("Digite o terceiro numero:");
        num3 = input.nextInt();
        
        int maior = num3;
        
        if(num1 > maior)
            maior = num1;
        if(num2 > maior)
            maior = num2;
        
        System.out.printf("O maior numero e: %d \n" , maior);
       
        
        int menor = num3;
        if(num1< menor)
            menor = num1;
        if (num2 < menor)
            menor = num2;
        
        System.out.printf("O menor numero e: %d \n", menor);
       
        raiz= Math.sqrt(menor);
        System.out.printf("A raiz quadrada de %d: %f\n", menor, raiz);

        
    }
    
}
