/*
4. Desenvolver um programa que leia uma matriz 2 x 2 de valores inteiros e apresente o seu determinante.
 */
package atividade3;

// @author Lohan Yochinori Petermann Yugue

import java.util.Scanner;


public class exercicio4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n = 2;
        int diagonalPrincipal = 1;
        int diagonalSecundaria = 1;
        int resultado;
        
        int matriz [][] = new int [n][n];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe o valor da linha["+(i+1)+"] coluna["+(j+1)+"]: ");
            matriz[i][j]=leitor.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j){
                    diagonalPrincipal = diagonalPrincipal * matriz[i][j];
                }
                else if ((i+j)==(n-1)){
                    diagonalSecundaria = diagonalSecundaria * matriz[i][j];
                }    
            }
        }
    
        resultado = diagonalPrincipal-diagonalSecundaria;
            
        System.out.println(diagonalPrincipal+" - "+diagonalSecundaria+" = "+resultado);
    
    }
    
}
