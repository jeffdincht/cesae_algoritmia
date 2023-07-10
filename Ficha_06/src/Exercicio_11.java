import java.util.Scanner;

public class Exercicio_11 {

    static int[] declareArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos numeros no array? ");
        int numero = input.nextInt();
        int[] array = new int[numero];

        for(int i = 0; i <numero; i++){
            System.out.println("Digite um numero");
            array[i]= input.nextInt();
        }
        return array;
    }
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
    static boolean crescente(int[] array){
        boolean crescente = true;
        for(int i=1; i<array.length; i++){
            if(array[i]<= array[i-1]){
                crescente = false;
            }
        }
        return crescente;
    }
    static int maiorValor(int[] array){
        int valor = 0;
        for(int i = 0; i <array.length; i++){
            if(i == 0){
                valor = array[i];
            }
            if(array[i]>valor){
                valor = array[i];
            }
        }
        return valor;
    }


    public static void main(String[] args) {
        int[] array = declareArray();

        System.out.println("maior valor "+maiorValor(array));
        System.out.println("menor valor "+menorValor(array));
        System.out.println("Crescente? "+crescente(array));


    }
}
