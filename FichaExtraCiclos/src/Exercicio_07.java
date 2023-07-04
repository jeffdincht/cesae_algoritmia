import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positivos = 0, negativos = 0;

        System.out.println("Digite um Numero: ");
        int num = input.nextInt();

        while(num != 0){
            System.out.println("Digite um Numero: ");
            num = input.nextInt();

            if(num < 0){
                negativos++;
            }else{
                positivos++;
            }

        }

        System.out.println("Quantidade de positivos: "+positivos+"\nQuantidade de negativos: "+negativos);


    }
}
