package Parte_02;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor para o array 1");
            array1[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor para o array 2");
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if(j == 0){
                    matriz[i][j] = array1[i];
                }else{
                    matriz[i][j] = array2[i];
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
}
