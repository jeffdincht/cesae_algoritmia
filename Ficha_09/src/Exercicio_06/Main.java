package Exercicio_06;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sum(1, 1));
        System.out.println(calc.sub(2, 1));
        System.out.println(calc.multiply(2, 5));
        System.out.println(calc.divide(10, 2));
    }
}
