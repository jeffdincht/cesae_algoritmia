package Parte_02;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Random rd = new Random();
        int[][] matriz = new int[3][3];

        int maior=0, menor=0;

        // ________________________________________________
      /*int contador;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rd.nextInt(0,99);
                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }
            }
        }*/
        // ________________________________________________

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um valor");
                matriz[i][j] = input.nextInt();
                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Maior: "+maior+"\nMenor: "+menor);
    }
}
