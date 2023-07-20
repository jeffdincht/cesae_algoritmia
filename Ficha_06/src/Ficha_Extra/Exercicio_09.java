package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_09 {
    static String mes(int numero) {
        String[] mes = new String[]{"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        for (int i = 1; i <= mes.length; i++) {
            if (numero == i) {
                return mes[i - 1];
            }
        }
        return "nao há mais que 12 meses";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 12");
        int numero = input.nextInt();
        System.out.println(mes(numero));
    }
}
