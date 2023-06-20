import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        System.out.println("Exercicio_17");
        Scanner input = new Scanner(System.in);

        double valor, saldo;

        System.out.println("Digite o valor do saldo medio: ");
        saldo = input.nextDouble();

        if(saldo >= 0 && saldo <= 2000){
            System.out.println(" Não recebe crédito ");
        }if(saldo >2000 && saldo <= 4000){
            valor = saldo * 0.2;
            System.out.println("Saldo Medio: "+saldo+"\n 20% de crédito: "+valor);
        }if(saldo > 4000 && saldo <= 6000){
            valor = saldo * 0.3;
            System.out.println("Saldo Medio: "+saldo+"\n 30% de crédito: "+valor);
        }if(saldo > 6000){
            valor = saldo * 0.4;
            System.out.println("Saldo Medio: "+saldo+"\n 30% de crédito: "+valor);
        }
    }

}
