package Parte_01;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for(int i = 0; i <10; i++){
            System.out.println("Digite um numero");
            array[i]= input.nextInt();
        }

        for(int i = 0; i <10; i++){
            System.out.println("numero: "+array[i]);

        }
    }
}
