package Parte_02;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um valor");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i == j){
                    soma = soma + matriz[i][j];
                }
            }
        }

        System.out.println(soma);
    }
}
