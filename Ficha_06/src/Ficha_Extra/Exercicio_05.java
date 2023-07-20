package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_05 {
    static String contarPiada(int numero) {
        String[] biblioteca = new String[]{"a", "b", "c", "d", "e"};

        if (numero >= biblioteca.length) {
            return "nao há mais que 5";
        } else {
            return biblioteca[numero];
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPiada;

        System.out.println("Qual piada quer escutar?");
        numPiada = input.nextInt();

        String piada = contarPiada(numPiada);
        System.out.println(piada);


    }
}
