/*
Um vetor é palíndromo se ele não se altera quando as posições das componentes são invertidas. 
Por exemplo, o vetor v = {1, 3, 5, 2, 2, 5, 3, 1} é palíndromo. 
Desenvolver uma função que recebe por parâmetro um vetor de inteiros e retorna uma valor booleano 
indicando se o vetor é ou não palíndromo.
 */
package atividade3;

// @author Lohan Yochinori Petermann Yugue

import java.util.Scanner;


public class exercicio3 {
    
    public static void main(String[] args) {
        
        int vetor [] = new int [8];
        
        ler(vetor);
        palindromo(vetor);
    }
    
    public static void ler (int vetor []) {
            
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor do vetor ["+(i+1)+"]: ");
            vetor[i]=leitor.nextInt();
        }
        
    }
    
    public static int [] palindromo (int vetor[]) {
        
        int metade1 = 0;
        int metade2 = 0;
        boolean palindromo;
        
        for (int i = 0; i <= 3; i++) {
            metade1 = metade1 + vetor[i];
        }        
         System.out.println(" ");
        for (int j = 4; j <= 7; j++) {
            metade2 = metade2 + vetor[j];
        }
        
        if (metade1==metade2){
            System.out.println(palindromo=true);
        }
        else{
            System.out.println(palindromo=false);
        }
        
        return vetor;
    }
}
