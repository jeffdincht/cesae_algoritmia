import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        System.out.println("Exercicio 16");
        Scanner input = new Scanner(System.in);

        int valor, notas;

        System.out.println("Numero");
        valor = input.nextInt();

        if(valor >= 200){
            notas = valor/200;
            valor = valor%200;
            System.out.println("Notas de 200: "+notas);
        }if(valor >= 100){
            notas = valor/100;
            valor = valor%100;
            System.out.println("Notas de 100: "+notas);
        }if(valor >= 50){
            notas = valor/50;
            valor = valor%50;
            System.out.println("Notas de 50: "+notas);
        }if(valor >= 20){
            notas = valor/20;
            valor = valor%20;
            System.out.println("Notas de 20: "+notas);
        }if(valor >= 10){
            notas = valor/10;
            valor = valor%10;
            System.out.println("Notas de 10: "+notas);
        }if(valor >= 5){
            notas = valor/5;
            System.out.println("Notas de 5: "+notas);
        }
    }
}
