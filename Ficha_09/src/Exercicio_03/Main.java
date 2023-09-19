package Exercicio_03;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(2, 5);
        int height = retangulo.getHeight();
        int width = retangulo.getWidth();
        int area = height * width;
        int perim = 2*(height+width);


        System.out.println("Retangulo: \nAltura: "+height+"\nLargura: "+width);
        System.out.println("\nArea: "+area);
        System.out.println("\nPerimetro: "+perim);

    }


}
