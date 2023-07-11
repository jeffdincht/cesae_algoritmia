package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_03 {

    static int calcularArea(int base, int altura){
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Diga a altura: ");
        altura = input.nextInt();

        System.out.println("Diga a base: ");
        base = input.nextInt();

        area = calcularArea(base, altura);
        System.out.println("Area: "+area);
    }
}
