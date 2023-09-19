package Exercicio_05;

public class Pessoa {
    private String nome, email;
    private int idade, fone;

    public Pessoa(String nome, String email, int idade, int fone) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.fone = fone;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Idade: "+this.idade);
        System.out.println("Fone: "+this.fone);
    }
}
