package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_07 {

    static int inverterNumero(int numero){
        int sobra, sobraSomada = 0;
        while(numero != 0){
            sobra = numero%10;
            sobraSomada = sobraSomada *10 + sobra;
            numero = numero/10;
        }
        return sobraSomada;
    }


    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = input.nextInt();


        inverterNumero
    }
}
