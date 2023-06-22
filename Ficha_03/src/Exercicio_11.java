import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.println("Digite o valor inicial: ");
        inicio = input.nextInt();

        System.out.println("Digite o valor final: ");
        fim = input.nextInt();

        while (inicio < fim) {
            if (inicio % 5 == 0) {
                System.out.println("Multiplos de 5: " + inicio);
            }
            inicio++;
        }
    }
}
