package Exercicio_11;

public class Conta {

    private String numero_conta;
    private double saldo = 0;
    private String titular;

    /**
     * Metodo Construtor para uma Conta
     *
     * @param numero_conta - IBAN (Numero da conta)
     * @param titular      - Nome do titular da conta
     */
    public Conta(String numero_conta, String titular) {
        this.numero_conta = numero_conta;
        this.titular = titular;
    }

    /**
     * Metodo para depositar dinheiro na conta
     *
     * @param valor - valor a depositar
     */
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("\nDeposito Feito");
    }

    /**
     * Metodo para Levantar dinheiro da Conta
     * @param valor - Valor a Levantar
     */
    public void levantar(double valor) {
        if(this.saldo >= valor){
            //caso possa levantar
            this.saldo -= valor;
        }else{
            //caso nao tenha saldo suficiente
            System.out.println("\nLevantamento Recusado! Sem saldo");
        }
    }

    /**
     * Metodo para imprimir detalhes da conta
     */
    public void verDetalhes(){
        System.out.println("\nNumero da conta: "+this.numero_conta);
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: " + this.saldo);
    }

    /**
     * Metodo para transferir dinheiro de uma conta para a outra
     * @param contaDestino - Conta destino a receber valor
     * @param valor - valor a depositar
     */
    public void transferir(Conta contaDestino, double valor){
        if(this.saldo>=valor){
            //caso possa transferir
            System.out.println("\nTransferencia feita");
            this.saldo-=valor;
            contaDestino.depositar(valor);
        }else{
            //caso nao possa transferir, sem saldo.
            System.out.println("\nSem Saldo");
        }
    }
}
