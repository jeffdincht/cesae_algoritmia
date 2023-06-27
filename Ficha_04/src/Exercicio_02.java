import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;


        do {
            do {
                System.out.println("Digite: \n1- Criar \n2- Editar \n3- Eliminar \n4- Sair");
                num = input.nextInt();

                if(num < 1 || num > 4){
                    System.out.println("N é uma opcao valida");
                }

            } while (num < 1 || num > 4);
            switch (num) {
                case 1:
                    System.out.println("Operacao escolhida: Criar");
                    break;
                case 2:
                    System.out.println("Operacao escolhida: Editar");
                    break;
                case 3:
                    System.out.println("Operacao escolhida: Eliminar");
                    break;
                default:
                    break;
            }
        }while(num != 4);
    }
}
