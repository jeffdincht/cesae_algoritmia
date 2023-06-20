import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fim;

        System.out.println("Digite o inicio: ");
        num = input.nextInt();

        System.out.println("Digite o fim: ");
        fim = input.nextInt();

        while(num<=fim){
            System.out.println("Intervalo: "+num);
            num++;
        }
    }
}
