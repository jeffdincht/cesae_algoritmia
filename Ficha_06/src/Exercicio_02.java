import java.util.Scanner;

public class Exercicio_02 {

    static boolean parOuImpar(int numero){
        return numero % 2 == 0;
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se é par ou impar");
        int numero = input.nextInt();

        System.out.println(parOuImpar(numero));

    }
}
