import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, i = 0, soma = 0, media;

        while (num != -1) {
            System.out.println("Digite um numero: ");
            num = input.nextInt();
            if(num != -1){
                soma = soma + num;
                i++;
            }
        }

        media = soma / i;
        System.out.println("Media: " + media);
    }


}
