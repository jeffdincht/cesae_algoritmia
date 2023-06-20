import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1, entre025 = 0, entre2650 = 0, entre5175 = 0, entre76100 = 0;

        while (num > 0) {
            System.out.println("Digite um numero: ");
            num = input.nextInt();
            if (num != -1) {
                if (num > 0 && num <= 25) {
                    entre025++;
                }
                if (num > 25 && num <= 50) {
                    entre2650++;
                }
                if (num > 50 && num <= 75) {
                    entre5175++;
                }
                if(num > 76 && num <= 100){
                    entre76100++;
                }
            }
        }

        System.out.println("Valores entre 0 e 25 "+entre025);
        System.out.println("Valores entre 26 e 50 "+entre2650);
        System.out.println("Valores entre 51 e 75 "+entre5175);
        System.out.println("Valores entre 76 e 100 "+entre76100);

    }
}