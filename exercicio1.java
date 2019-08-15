/*
1 - Desenvolver uma função que recebe, por parâmetro, dois valores X e Z e 
calcula e retorna X elevado a Z (sem utilizar funções ou operadores de potência prontos).
 */
package atividade3;

// @author Lohan Yochinori Petermann Yugue

import java.util.Scanner;


public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("Informe o número base: ");
        int num1 = ler();
        System.out.println("Informe o número da potência: ");
        int num2 = ler();
        potencia(num1, num2);
        
    }
    
    public static int ler () {
        
        Scanner leitor = new Scanner (System.in);
        int num = leitor.nextInt();
        
        return num;
    }
    
    public static int potencia (int num1, int num2) {
        int soma = 1;
        
        for (int i = 1; i <= num2; i++) {
            soma = soma * num1;
        }
        
        /*for (num1 = 1; num1 <= num2; num1++) {
            soma = soma * num1; 
        }*/
        
        System.out.println(soma);
        
        return soma;
    }
    
}
