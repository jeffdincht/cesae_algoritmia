package Exercicio_09;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Camiseta", 1.75);
        product.buy(5);
        product.sell(2);
        product.buy(10);
        product.sell(35);
    }
}
