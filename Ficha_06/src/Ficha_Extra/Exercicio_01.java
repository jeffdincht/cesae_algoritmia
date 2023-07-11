package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_01 {

    static int menorNumero(int num1, int num2, int num3 ){
        if(num1 < num2 && num1 < num3){
            return num1;
        }if(num2 < num1 && num2 < num3){
            return num2;
        }else{
            return num3;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Introduza o numero 1");
        num1 = input.nextInt();

        System.out.println("Introduza o numero 2");
        num2 = input.nextInt();

        System.out.println("Introduza o numero 3");
        num3 = input.nextInt();

        int menor = menorNumero(num1, num2, num3);
        System.out.println("menor numero: "+menor);
    }
}
