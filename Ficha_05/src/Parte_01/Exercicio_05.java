package Parte_01;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        double media;

        double[] array = new double[10];

        for(int i=0; i<10; i++){
            System.out.println("Digite o valor  da nota"+i);
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            soma = soma + array[i];
        }

        media = soma/array.length;
        System.out.println(media);
    }
}
