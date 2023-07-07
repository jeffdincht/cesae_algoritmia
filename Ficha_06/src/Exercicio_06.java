import java.util.Scanner;

public class Exercicio_06 {

    static boolean parOuImpar(int numero) {
        return numero % 2 == 0;
    }

    static boolean positivoOuNegativo(int numero) {
        return numero >= 0;
    }

    static boolean primo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador == 2;
    }

    static boolean perfeito(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }
        return soma == numero;
    }

    static boolean funcoes(int numero) {
        Scanner input = new Scanner(System.in);
        int opcoes;

        do {
            do {
                System.out.println("Procedimento \n1- par ou impar \n2- positivo ou negativo \n3- é primo ou nao \n4- É perfeito ou não ");
                opcoes = input.nextInt();
            } while (opcoes < 1 || opcoes > 4);

            switch (opcoes) {
                case 1 -> {
                    System.out.println("Opção 1: Par ou Impar?");
                    return parOuImpar(numero);
                }
                case 2 -> {
                    System.out.println("Opção 2: Positivo ou Negativo?");
                    return positivoOuNegativo(numero);
                }
                case 3 -> {
                    System.out.println("Opção 3: É primo?");
                    return primo(numero);
                }
                default -> {
                    System.out.println("Opção 4: É perfeito?");
                    return perfeito(numero);
                }
            }
        } while (opcoes != 0);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero para fazer procedimento: ");
        int numero = input.nextInt();

        System.out.println(funcoes(numero));
    }
}
