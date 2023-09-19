package Exercicio_06;

public class Atleta {
    private String nome, modalidade, pais;
    private double peso, altura;

    public Atleta(String nome, String modalidade, String pais, double peso, double altura) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pais = pais;
        this.peso = peso;
        this.altura = altura;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("modalidade: "+this.modalidade);
        System.out.println("pais: "+this.pais);
        System.out.println("peso: "+this.peso);
        System.out.println("altura: "+this.altura);
    }
}
