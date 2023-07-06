package Parte_02;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.println("Digite um valor");
                matriz[i][j] = input.nextInt();
                soma = soma + matriz[i][j];
            }
        }

        System.out.println("Valor da soma: "+soma);

    }
}
