package Parte_01;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean crescente = true;
        int[] array = new int[10];

        for(int i=0; i<10; i++){
            System.out.println("Digite um valor "+i);
            array[i] = input.nextInt();
        }
        for(int i=1; i<10; i++){
            if(array[i]<= array[i-1]){
                crescente = false;
            }
        }


        System.out.println(crescente);
    }
}
