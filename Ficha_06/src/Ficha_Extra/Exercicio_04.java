package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_04 {
    static void imprimirTabuada(int numero){
        for(int i = 1; i<=10; i++){
            int result = numero*i;
            System.out.println(numero+"x"+i+"="+result);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = input.nextInt();

        imprimirTabuada(numero);
    }
}
