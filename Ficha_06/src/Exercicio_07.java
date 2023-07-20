import java.util.Scanner;

public class Exercicio_07 {

    static int[] createArray(int numero, int[] array){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <numero; i++){
            System.out.println("Digite um numero");
            array[i]= input.nextInt();
        }
        return array;
    }

    static void printArray(int numero, int[] array){
        System.out.println("Quantidade de numeros no array: "+numero);
        for(int i = 0; i <numero; i++){
            if(i == 0){
                System.out.print("[ ");
            }
            System.out.print(array[i]+" ");
            if(i == numero-1){
                System.out.print("]");
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos numeros no array? ");
        int numero = input.nextInt();

        int[] array = new int[numero];

        printArray(numero, createArray(numero, array));
    }
}
