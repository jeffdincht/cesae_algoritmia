import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, tentativa, i = 0;

        do {
            System.out.println("Jogador 1, digite um numero entre 0 e 100: ");
            valor = input.nextInt();

            if (valor < 0 || valor > 100) {
                System.out.println("Valor fora do limite");
            }

        } while (valor < 0 || valor > 100);


        do {
            System.out.println("Jogador 2, adivinhe o numero: ");
            tentativa = input.nextInt();
            i++;

            if (tentativa > valor) {
                System.out.println("Tentativa acima do valor");
            }
            if (tentativa < valor) {
                System.out.println("Tentativa abaio do valor");
            }

            if(tentativa == valor){
                System.out.println("foram necessárias "+i+" tentativas para acertar o número");
            }

        } while (tentativa != valor);


    }
}
