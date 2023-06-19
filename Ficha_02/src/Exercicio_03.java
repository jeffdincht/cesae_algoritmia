import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        System.out.println("Exercicio_03");

        double salario;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor");
        salario = input.nextDouble();

        if(salario <= 15000){
            salario = salario * 0.2;
        }if(salario > 15000 && salario <= 20000){
            salario = salario * 0.3;
        }if(salario > 20000 && salario <=25000){
            salario = salario * 0.35;
        }else{
            salario = salario * 0.4;
        }

        System.out.println("Valor a pagar: "+salario);
    }
}
