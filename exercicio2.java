/*
2 - Desenvolver um programa que leia um vetor de 16 posições de valores inteiros e troque os 
8 primeiros valores pelos 8 últimos valores e vice-versa. 
Ao final apresentar na tela os dados do vetor obtido.
 */
package atividade3;

// @author Lohan Yochinori Petermann Yugue
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int vetor[] = new int[16];
        int vetor2[] = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o vetor[%d]: \n", (i + 1));
            vetor[i] = leitor.nextInt();
            vetor2[i] = vetor[i];
        }

        int j = 8;
        int k = 0;

        for (int i = 0; i < 8; i++) {

            vetor[i] = vetor2[j];
            j++;

            
        }
        for (int i = 8; i < vetor.length; i++) {

            vetor[i] = vetor2[k];
            k++;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: %d \n", (i + 1), vetor[i]);
        }
    }
}
