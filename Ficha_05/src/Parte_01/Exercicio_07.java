package Parte_01;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = 0;
        int onlyOdd = 0;
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor " + i);
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] > valor) {
                    valor = array[i];
                }
            } else {
                onlyOdd++;
            }
        }

        if (onlyOdd == 10) {
            System.out.println("Nao há pares");
        }else{
            System.out.println("Maior valor par: "+valor);;
        }
    }
}
