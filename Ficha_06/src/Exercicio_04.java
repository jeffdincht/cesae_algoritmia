import java.util.Scanner;

public class Exercicio_04 {

    static boolean primo(int numero){
        int contador = 0;
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                contador++;
            }
        }
        return contador == 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se é primo");
        int numero = input.nextInt();

        System.out.println(primo(numero));
    }
}
