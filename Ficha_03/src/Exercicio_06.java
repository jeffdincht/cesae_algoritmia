import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        i = num -5;

        while(i<num){
            System.out.println("Menores: "+i);
            i++;
        }

         i +=5;

        while(i>num){
            num++;
            System.out.println("Maiores:"+num);
        }

    }
}
