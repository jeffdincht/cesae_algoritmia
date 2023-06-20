import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i = 0;
        System.out.println("Digite um numero: ");
        num = input.nextInt();

        while(i<=num){
            System.out.println("Numeros: "+i);
            i++;
        }
    }
}
