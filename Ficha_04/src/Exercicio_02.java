import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite: \n1 - Criar \n2- Editar \n3-Eliminar \n4-Sair");
            num = input.nextInt();
        }while(num != 4){
            switch (num){
                case 1:
                    System.out.println("Operacao escolhida: Criar");
                case 2:
                    System.out.println("Operacao escolhida: Editar");
                case 3:
                    System.out.println("Operacao escolhida: Eliminar");
            }
        }
    }
}
