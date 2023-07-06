package Parte_01;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor a ser somado");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            soma = soma + array[i];

        }
        System.out.println("Soma dos valores do array: "+soma);
    }
}
