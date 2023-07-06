package Parte_01;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean hasEven = false;
        int valor = 0;
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {

            //recebendo valores
            System.out.println("Digite o valor " + i);
            array[i] = input.nextInt();
            //se for par
            if (array[i] % 2 == 0) {
                //se for o primeiro par que encontra
                if (!hasEven) {
                    hasEven = true;
                    valor = array[i];
                }
                //se o par encontrado for maior que o par anterior
                if (array[i] > valor) {
                    valor = array[i];
                }
            }
        }

        if (!hasEven) {
            System.out.println("nao há pares");
        } else {
            System.out.println("valor " + valor + " é o maior par");
        }


    }
}
