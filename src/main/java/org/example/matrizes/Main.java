package org.example.matrizes;

public class Main {
    public static void main(String[] args) {
        // Matriz 3x3
        int[][] matriz = {
                {0, 1, 2},
                {1, 2, 3},
                {2, 3, 4}
        };

        // Imprimindo a matriz
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        // Soma dos elementos
        int soma = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
            }
        }
        System.out.println("Soma: " + soma);
    }

}
