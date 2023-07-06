package Parte_02;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][5];
        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite um valor");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("Digite um valor");
        int valor = input.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valor) {
                    contador++;
                }
            }
        }

        if(contador>=1){
            System.out.println("Valor "+valor+" existe "+contador+" vezes na matriz.");
        }

    }
}
