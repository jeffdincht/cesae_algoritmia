import java.util.Scanner;


public class Exercicio_14 {
    static void somarMatrizes(int[][] matriz1, int[][] matriz2){
        int[][] matrizSomada = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSomada[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizSomada[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

    static int somatorioMatrizes(int[][] matriz1, int[][] matriz2){
        int somatorio=0, somatorio2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somatorio = somatorio + matriz1[i][j];
                somatorio2 = somatorio2 + matriz2[i][j];
            }
        }
        return somatorio+somatorio2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um valor para matriz1");
                matriz1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um valor para matriz2");
                matriz2[i][j] = input.nextInt();
            }
        }
        somarMatrizes(matriz1, matriz2);
        somatorio = somatorioMatrizes(matriz1, matriz2);
        System.out.println("Somatorio das matrizes 1 e 2 = "+somatorio);
    }
}
