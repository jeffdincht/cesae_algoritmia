import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i= 2;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        while(i <= num){
            if(i%2 == 0){
                System.out.println("Pares: "+i);
            }
            i++;
        }


    }
}
