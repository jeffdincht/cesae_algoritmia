import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long num, aux, soma = 0, aux2, fatorial;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        aux = num;
        aux2 = num;

/*
        while(num != 1){
            fatorial = fatorial*(num-1);
            num--;
        }
        System.out.println(fatorial);
*/

        //fazendo sem multiplicar

                while (aux > 1) {
                    soma = 0;
                    aux2--;
                    while(num > 0){
                        soma = soma +aux2;
                        num--;
                    }
                    num = soma;
                    aux--;
                }

        System.out.println(soma);
    }
}
