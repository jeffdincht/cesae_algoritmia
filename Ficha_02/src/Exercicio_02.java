import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        System.out.println("Exercicio_02");

        double salario;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor");
        salario = input.nextDouble();

        if (salario <= 15000) {
            salario = salario * 0.2;
        } else {
            salario = salario * 0.3;
        }

        System.out.println("Valor a pagar: " + salario);
    }
}
