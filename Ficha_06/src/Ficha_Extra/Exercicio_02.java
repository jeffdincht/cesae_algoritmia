package Ficha_Extra;

import java.util.Scanner;

public class Exercicio_02 {

    static double mediaValores(double double1, double double2, double double3){
        double media = (double1+double2+double3)/3;
        return media;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double double1, double2, double3, media;

        System.out.println("Introduza a primeira nota: ");
        double1 = input.nextDouble();

        System.out.println("Introduza a segunda nota: ");
        double2 = input.nextDouble();

        System.out.println("Introduza a terceira nota: ");
        double3 = input.nextDouble();

        media = mediaValores(double1,double2,double3);
        System.out.println("Media: "+media);

    }
}
