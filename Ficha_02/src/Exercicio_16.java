import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Numero");
        int i = input.nextInt();

        int valor = i%50;
        System.out.println("valor"+valor);
    }
}
