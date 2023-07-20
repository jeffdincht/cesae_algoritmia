package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_08 {

    static boolean vogal(String letra) {

        String[] vogais = new String[]{"a", "e", "i", "o", "u"};

        for (int i = 0; i < vogais.length; i++) {
            if (letra.equalsIgnoreCase(vogais[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = input.next();

        System.out.println(vogal(letra));

    }
}
