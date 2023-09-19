package Exercicio_05;

public class Agenda {
    private Pessoa[] pessoas;
    private int posicao;

    public Agenda() {
        this.pessoas = new Pessoa[30];
    }

    public void addPessoa(Pessoa novaPessoa){
        this.pessoas[posicao++] = novaPessoa;
    }

    public void mostrarAgenda(){
        for(int i = 0; i<posicao;i++){
            this.pessoas[i].mostrarDetalhes();
        }
    }
}
