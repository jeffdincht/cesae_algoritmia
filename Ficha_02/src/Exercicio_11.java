import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        System.out.println("Exercicio_08");

        Scanner input = new Scanner(System.in);

        double valor, saldo;
        int operacao;

        System.out.println("Qual o valor do Saldo: ");
        saldo = input.nextDouble();

        System.out.println("Qual operacao gostaria de fazer? \n1- Credito \n2- Debito");
        operacao = input.nextInt();


        switch (operacao){
            case 1:
                System.out.println("Qual o valor que gostaria de Creditar: ");
                valor = input.nextDouble();
                saldo = saldo + valor;
                System.out.println("Valor do Saldo: "+saldo);
                break;

            case 2:
                System.out.println("Qual o valor que Gostaria de Debitar: ");
                valor = input.nextDouble();

                if(valor <= saldo){
                    saldo = saldo - valor;
                    System.out.println("Valor do saldo: "+saldo);
                }else{
                    System.out.println("Operacao invalida");
                }

        }

    }
}