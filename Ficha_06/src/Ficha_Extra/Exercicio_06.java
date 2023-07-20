package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_06 {
    static int somarAlgarismos(int numero){
        int novoNumero;
        int soma = 0;

        while(numero%10 > 0 || numero/10 > 0){
            soma = soma + numero%10;
            novoNumero = numero/10;
            numero = novoNumero;
        }
        return soma;
    }

    public static void main(String[] args) {
        int numero, soma;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = input.nextInt();

        soma = somarAlgarismos(numero);
        System.out.println(soma);
    }
}
