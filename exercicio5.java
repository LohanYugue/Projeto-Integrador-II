/*
5. Desenvolver uma função que recebe uma matriz bidimensional por parâmetro e retorne a transposta desta matriz
 */
package atividade3;

// @author Lohan Yochinori Petermann Yugue
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        int[][] matriz = new int[2][3];
        ler(matriz);
        System.out.println("Matriz Original:");
        matriz(matriz);
        System.out.println("Matriz Transposta:");
        matriz(inverterMatriz(matriz));
        
    }

    public static void ler(int matriz[][]) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o valor da linha[" + (i + 1) + "] coluna[" + (j + 1) + "] : ");
                matriz[i][j] = leitor.nextInt();
            }
        }

    }

    public static void matriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] inverterMatriz(int matriz[][]) {

        int[][] inverterMatriz = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                inverterMatriz[j][i] = matriz[i][j];
            }
        }
            
        return inverterMatriz;
    }

}
