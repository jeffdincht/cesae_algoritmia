import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i, x, valorminimo = 0, valorMinimoExt = 0, fatorial, soma=0;

        System.out.println("Digite um numero: ");
        num = input.nextInt();
        x = num;
        i = num;
        fatorial = num;
/*
        while(num != 1){
            fatorial = fatorial*(num-1);
            num--;
        }
        System.out.println(fatorial);
*/

        //fazendo sem multiplicar (To fazendo exponenciação, preciso tirar um valor do numero a cada vez que retornar ao loop interno)


        while (valorMinimoExt < x) {
            while (valorminimo < i) {
                soma = soma + num;
                valorminimo++;
            }
            valorMinimoExt++;

        }

        System.out.println(soma);

    }
}
