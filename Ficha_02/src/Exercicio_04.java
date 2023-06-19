import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        System.out.println("Exercicio_04");

        Scanner input = new Scanner(System.in);

        int posicao, pontos;

        System.out.println("Em que lugar terminou a corrida: ");
        posicao = input.nextInt();

        switch (posicao) {
            case 1:
                pontos = 10;
                break;
            case 2:
                pontos = 8;
                break;
            case 3:
                pontos = 6;
                break;
            case 4:
                pontos = 5;
                break;
            case 5:
                pontos = 4;
                break;
            case 6:
                pontos = 3;
                break;
            case 7:
                pontos = 2;
                break;
            case 8:
                pontos = 1;
                break;
            default:
                pontos = 0;
                break;
        }
        System.out.println("Ganhou "+pontos+" pontos");
    }
}
