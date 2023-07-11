package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_05 {
    static String contarPiada(int numero){
        String[] biblioteca = new String[5];
        String sorry = "nao temos mais do que 5";
        biblioteca[0] = "a";
        biblioteca[1] = "b";
        biblioteca[2] = "c";
        biblioteca[3] = "d";
        biblioteca[4] = "e";

        if(numero >= biblioteca.length){
            return sorry;
        }else{
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
