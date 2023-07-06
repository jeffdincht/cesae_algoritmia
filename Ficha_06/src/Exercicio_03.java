import java.util.Scanner;

public class Exercicio_03 {
    static boolean positivoOuNegativo(int numero){
        return numero >= 0;
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se é positivo ou negativo");
        int numero = input.nextInt();

        System.out.println(positivoOuNegativo(numero));

    }
}
