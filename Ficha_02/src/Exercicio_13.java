import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        System.out.println("Exercicio_13");
        Scanner input = new Scanner(System.in);

        int hora, minuto;


        System.out.println("Digite as horas:");
        hora = input.nextInt();

        System.out.println("Digite os minutos");
        minuto = input.nextInt();

        if(hora > 12){
            hora = hora -12;
            System.out.println(hora+":"+minuto+"PM");
        }else{
            System.out.println(hora+":"+minuto+"AM");
        }
    }
}
