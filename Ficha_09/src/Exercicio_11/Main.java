package Exercicio_11;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("123", "Jeff");
        Conta conta2 = new Conta("456", "Fulano");


        conta1.verDetalhes();
        conta1.depositar(500);
        conta1.verDetalhes();
        conta1.levantar(750);
        conta1.verDetalhes();
        conta1.levantar(450);
        conta1.verDetalhes();


        conta1.transferir(conta2, 1);
        conta1.verDetalhes();
        conta2.verDetalhes();



    }
}
