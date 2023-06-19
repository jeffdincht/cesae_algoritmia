import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        System.out.println("Exercicio_10");

        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        String opcao;

        System.out.println("Digite a operacao que quer fazer (+,-,*,/): ");
        opcao = input.next();

        System.out.println("Digite o primeiro valor ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo valor ");
        num2 = input.nextInt();

        switch (opcao) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "="+result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "="+result);
                break;

            case "/":
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "="+result);
                break;

            default:
                System.out.println("Faça uma nova operação");
        }
    }
}
