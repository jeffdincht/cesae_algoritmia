import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, menor, maior;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        maior = num;
        menor = num;


        do {
            System.out.println("Digite um numero: ");
            num = input.nextInt();

            if(num < menor && num != 0){
                menor = num;
            }
            if(num > maior){
                maior = num;
            }

        } while (num != 0);

        System.out.println("Maior: " + maior);
        System.out.println("Menor" + menor);


    }
}
