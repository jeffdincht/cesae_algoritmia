import java.util.Scanner;

public class Exercicio_09 {
    static int menorValor(int[] array){
        int valor = 0;
        for(int i = 0; i <array.length; i++){
            if(i == 0){
                valor = array[i];
            }
            if(array[i]<valor){
                valor = array[i];
            }
        }
        return valor;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos numeros no array? ");
        int numero = input.nextInt();
        int[] array = new int[numero];

        for(int i = 0; i <numero; i++){
            System.out.println("Digite um numero");
            array[i]= input.nextInt();
        }

        System.out.println("menor valor "+menorValor(array));
    }
}
