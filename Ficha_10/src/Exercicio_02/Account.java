package Exercicio_02;

public class Account {
    private String accountNumber, client;
    private double balance, loanMargin, debtValue;
    private int creationDate = 2023;

    public Account(String accountNumber, String client, double balance, double debtValue) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.debtValue = debtValue;
        this.balance = balance;
        this.loanMargin = balance*0.9;
    }

    public Boolean loan(int loanValue){
        if(this.loanMargin>=loanValue){
            if(this.debtValue>0){
                System.out.println("Cannot loan. You have debt!");
                return false;
            }else{

                this.balance += loanValue;
                this.loanMargin = this.balance*0.9; //Fazer um setBalance com, para além de atualizar o balance, atualiza também o loanMargin com um "this.loanMargin = this.balance*09"
                System.out.println("Loan granted");
                return true;
            }
        }else{
            System.out.println("This value is invalid.");
            return false;
        }
    }

    public String getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public double getLoanMargin() {
        return loanMargin;
    }
}
