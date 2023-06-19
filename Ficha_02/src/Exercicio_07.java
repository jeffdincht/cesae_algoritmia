import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        System.out.println("Exercicio_07");

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        if(num%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }


    }
}