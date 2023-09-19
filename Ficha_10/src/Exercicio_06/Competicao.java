package Exercicio_06;

public class Competicao {
    private String nomeCompeticao, pais;
    int posicao;
    private Atleta[] atletas;

    public Competicao(String nomeCompeticao, String pais) {
        this.nomeCompeticao = nomeCompeticao;
        this.pais = pais;
        this.atletas = new Atleta[10];
    }

    public void addAtleta(Atleta newAtleta){
        this.atletas[posicao++] = newAtleta;
    }

    public void exibirDetalhes(){
        for(int i=0; i<this.posicao; i++){
            this.atletas[i].exibirDetalhes();

        }
    }
}
