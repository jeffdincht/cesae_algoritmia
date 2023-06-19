import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        System.out.println("Exercicio_09");

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite um numero: ");
        num1 = input.nextInt();

        System.out.println("Digite outro numero:");
        num2 = input.nextInt();

        System.out.println("Digite mais um numero");
        num3 = input.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("menor numero: "+num1);
        }if(num2 < num1 && num2 < num3){
            System.out.println("menor numero: "+num2);
        }if(num3 < num1 && num3 < num2){
            System.out.println("menor numero: "+num3);
        }
    }
}
