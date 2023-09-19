package Exercicio_04;

public class Imovel {

    private String rua, cidade;
    private int numPorta, numQuarto, numBanheiro;
    private double area, areaPiscina;
    private Tipo tipo;
    private Acabamento acabamento;


    public Imovel(String rua, String cidade, int numPorta, int numQuarto, int numBanheiro, double area, double areaPiscina, Tipo tipo, Acabamento acabamento) {
        this.rua = rua;
        this.cidade = cidade;
        this.numPorta = numPorta;
        this.numQuarto = numQuarto;
        this.numBanheiro = numBanheiro;
        this.area = area;
        this.areaPiscina = areaPiscina;
        this.tipo = tipo;
        this.acabamento = acabamento;
    }

    public double venderImovel(){
        double value = 0;
        if (this.tipo.equals(Tipo.APARTAMENTO)) {
            value = this.area*1000;
        }
        else if (this.tipo.equals(Tipo.CASA)) {
            value = this.area*3000;
        }
        else if(this.tipo.equals(Tipo.MANSAO)){
            value = this.area*5000;
        }


        if(this.acabamento.equals(Acabamento.PARA_RESTAURO)){
           value *= 0.5;
        }else if(this.acabamento.equals(Acabamento.USADA)){
            value *= 0.9;
        }else if(this.acabamento.equals(Acabamento.NOVA_COM_ALTO_ACABAMENTO)){
            value *= 1.25;
        }

        value += numQuarto*7500;
        value += numBanheiro*10500;
        value += areaPiscina*1000;

        return value;
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public void imprimirDescricao(){
        System.out.println("rua: "+this.rua);
        System.out.println("numero da porta: "+this.numPorta);
        System.out.println("cidade: "+this.cidade);
        System.out.println("tipo: "+this.tipo);
        System.out.println("acabamento: "+this.acabamento);
        System.out.println("area: "+this.area);
        System.out.println("numero quarto: "+this.numQuarto);
        System.out.println("numero banheiros"+this.numBanheiro);
        System.out.println("area piscina"+this.areaPiscina);
    }

    public Imovel compararImoveis(Imovel imovel){
        if(this.venderImovel() > imovel.venderImovel()){
            return this;
        }else if(imovel.venderImovel() > this.venderImovel()){
            return imovel;
        }else{
            return null;
        }
    }

}