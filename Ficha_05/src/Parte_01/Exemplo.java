package Parte_01;

public class Exemplo {

    public static void main(String[] args) {

        int[][] matriz = new int[4][3];

        matriz[0][0]= 100;
        matriz[0][1]= 10;
        matriz[0][2]= 100;

        matriz[1][0]= 100;
        matriz[1][1]= 100152;
        matriz[1][2]= 100;

        matriz[2][0]= 100;
        matriz[2][1]= 100111;
        matriz[2][2]= 100;

        matriz[3][0]= 100;
        matriz[3][1]= 100111;
        matriz[3][2]= 100;

// Imprimir linha superior da tabela
        System.out.print("+");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("______+");
        }
        System.out.println();

// Imprimir conteúdo da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("|");
                System.out.printf("%6d", matriz[linha][coluna]);
            }
            System.out.print("|");
            System.out.println();

// Imprimir linha separadora
            System.out.print("+");
            for (int i = 0; i < 3; i++) {
                System.out.print("______+");
            }
            System.out.println();
        }
    }
}
