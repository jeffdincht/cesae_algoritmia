import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        System.out.println("Exercicio_12");

        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("Digite \n1. Criar \n2. Atualizar \n3. Eliminar \n4. Sair");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Criar");
                break;

            case 2:
                System.out.println("Atualizar");
                break;

            case 3:
                System.out.println("Eliminar");
                break;
            case 4:
                break;

            default:
                System.out.println("Esta opcao e invalida");
                break;
        }
    }
}
