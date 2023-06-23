import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String continuar = "continuar";
        String operacao;
        double num1, num2, result;

        while (!continuar.equals("Sair")) {

            System.out.println("Digite um valor: ");
            num1 = input.nextInt();

            System.out.println("Digite a operação (+, -, *, /): ");
            operacao = input.next();

            System.out.println("Digite o segundo valor: ");
            num2 = input.nextInt();

            switch (operacao) {
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
            }



            System.out.println("Gostaria de continuar?");
            continuar = input.next();
        }


    }

}
