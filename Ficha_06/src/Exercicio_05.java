import java.util.Scanner;

public class Exercicio_05 {

    static boolean perfeito(int numero){
        int soma=0;
        for(int i=1; i<numero; i++){
            if(numero%i==0){
                soma = soma + i;
            }
        }
        return soma == numero;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que gostaria de saber se é perfeito:");
        int numero = input.nextInt();

        System.out.println(perfeito(numero));
    }
}
