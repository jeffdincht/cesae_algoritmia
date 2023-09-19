package Exercicio_04;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("1", "1", 2, 3, 4, 100, 5, Tipo.APARTAMENTO, Acabamento.USADA);
        Imovel imovel2 = new Imovel("1", "1", 2, 3, 4, 100, 5, Tipo.APARTAMENTO, Acabamento.NOVA);

        System.out.println(imovel2.venderImovel());
        imovel.setAcabamento(Acabamento.NOVA_COM_ALTO_ACABAMENTO);
        imovel.imprimirDescricao();

        Imovel maior = imovel.compararImoveis(imovel2);
        System.out.println("imovel mais caro");
        maior.imprimirDescricao();
        //^ Pode ser também:
        (imovel.compararImoveis(imovel2)).imprimirDescricao();
    }
}
