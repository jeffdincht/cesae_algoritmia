import java.util.Scanner;

public class Exercicio_13 {

    static void printSquare(String letra, int l, int c) {

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if(i!=0 && i!=l-1 && j!=0 && j!=c-1){
                    System.out.print(" ");
                }else{
                    System.out.print(letra);
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = input.next();

        System.out.println("Digite o valor de linha: ");
        int l = input.nextInt();

        System.out.println("Digite o valor de coluna: ");
        int c = input.nextInt();

        printSquare(letra, l, c);
    }
}
