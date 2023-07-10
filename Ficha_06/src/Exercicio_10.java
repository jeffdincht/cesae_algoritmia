import java.util.Scanner;

public class Exercicio_10 {

    static boolean crescente(int[] array){
        boolean crescente = true;
        for(int i=1; i<array.length; i++){
            if(array[i]<= array[i-1]){
                crescente = false;
            }
        }
        return crescente;
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

        System.out.println(crescente(array));

    }
}
