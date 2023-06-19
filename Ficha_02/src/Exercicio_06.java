import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        System.out.println("Exercicio_06");

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite um numero: ");
        num1 = input.nextInt();

        System.out.println("Digite outro numero:");
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("Numero "+num1+" > "+num2);
        }else{
            System.out.println("Numero: "+num2+" > "+num1);
        }


    }
}