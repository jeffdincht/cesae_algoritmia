import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fatorial;

        System.out.println("Digite um numero: ");
        num = input.nextInt();
        fatorial = num;

        while(num != 1){
            fatorial = fatorial*(num-1);
            num--;
        }
        System.out.println("Fatorial: "+fatorial);
    }
}
