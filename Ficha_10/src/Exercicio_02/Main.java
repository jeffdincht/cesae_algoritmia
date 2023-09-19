package Exercicio_02;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("1", "Jeff", 1000, 0);
        Account account2 = new Account("2", "Fulano", 0,0);
        Account account3 = new Account("3", "Ciclano", 150, 300);

        System.out.println(account1.getLoanMargin());
        account1.loan(900);
        System.out.println(account1.getLoanMargin());
        account1.loan(100);
        System.out.println(account1.getLoanMargin());

    }
}
