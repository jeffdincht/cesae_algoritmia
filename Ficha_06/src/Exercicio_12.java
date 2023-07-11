import java.util.Scanner;

public class Exercicio_12 {

    static int numeroPositivo() {
        Scanner input = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um numero inteiro positivo");
            numero = input.nextInt();
        } while (numero < 1);

        return numero;
    }

    static void imprimirAsteriscos(int numero){
        for(int i = 0; i<numero; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        int numero = numeroPositivo();
        imprimirAsteriscos(numero);

    }
}
