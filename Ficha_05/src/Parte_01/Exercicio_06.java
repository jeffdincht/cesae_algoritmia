package Parte_01;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = 0;
        boolean crescente = false;
        int[] array = new int[10];

        for(int i=0; i<10; i++){
            System.out.println("Digite um valor "+i);
            array[i] = input.nextInt();
        }
        for(int i=0; i<10; i++){
            if(array[i]> valor){
                crescente = true;
                valor = array[i];
            }else{
                crescente = false;
                break;
            }
        }
        System.out.println(crescente);
    }
}
