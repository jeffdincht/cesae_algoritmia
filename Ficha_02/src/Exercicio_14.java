import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        System.out.println("Exercicio_14");
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite um numero: ");
        num1 = input.nextInt();

        System.out.println("Digite outro numero:");
        num2 = input.nextInt();

        System.out.println("Digite mais um numero");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println("menor: " + num1 + " num: " + num2 + " num: " + num3);
        }
        if (num1 < num3 && num3 < num2) {
            System.out.println("menor: " + num1 + " num: " + num3 + " num: " + num2);
        }
        if (num2 < num1 && num2 < num3 && num1 < num3) {
            System.out.println("menor: " + num2 + " num: " + num1 + " num: " + num3);
        }
        if (num2 < num3 && num3 < num1) {
            System.out.println("menor: " + num2 + " num: " + num3 + " num: " + num1);
        }
        if (num3 < num1 && num3 < num2 && num1 < num2) {
            System.out.println("menor: " + num3 + " num: " + num1 + " num: " + num2);
        }
        if (num3 < num2 && num2 < num1) {
            System.out.println("menor: " + num3 + " num: " + num2 + " num: " + num1);
        }

    }
}
