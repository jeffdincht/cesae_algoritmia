package Parte_01;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = 0;
        int[] array = new int[10];

        for(int i=0; i<10; i++){
            System.out.println("Digite o valor "+i);
            array[i] = input.nextInt();
            if(i == 0){
                valor = array[i];
            }
            if(array[i]<valor){
                valor = array[i];
            }
        }


        System.out.println(valor);
    }
}
