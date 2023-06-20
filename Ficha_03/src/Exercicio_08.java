import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        // Suponha que o número lido da entrada será maior que 2.
        Scanner input = new Scanner(System.in);
        int num, i= 2;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        while(i <= num){
            if(i%2 == 0){
                System.out.println("Pares: "+i);
            }
            i++;
        }


    }
}
