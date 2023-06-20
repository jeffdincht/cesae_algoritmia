import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i=0, salto;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        System.out.println("Digite um numero: ");
        salto = input.nextInt();

        while(i <= num){
            System.out.println("Valor: "+i);
            i = i+salto;
        }
    }
}
