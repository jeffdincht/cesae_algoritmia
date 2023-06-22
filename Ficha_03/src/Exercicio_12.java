import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, aux=0;

        while(num != -1){
            System.out.println("Digite um numero");
            num = input.nextInt();
            if(num < aux){
                num = -1;
                System.out.println("Não é crescente");
            }else{
                System.out.println("É crescente, pode continuar.");
            }
            aux = num;
        }

    }
}
