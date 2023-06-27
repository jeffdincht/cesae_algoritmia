import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, i, j = 0;

        System.out.println("Digite o valor que gostaria de saber se é primo: ");
        valor = input.nextInt();

        for(i = 1; i <= valor; i++){
            if(valor%i == 0){
                j++;
            }
        }
        if(j == 2){
            System.out.println("é primo");
        }else{
            System.out.println("Nao é primo");
        }
    }
}
