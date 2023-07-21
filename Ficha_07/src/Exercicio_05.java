import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("textos/numeros.txt"));
        int soma = 0;

        while(file.hasNextInt()){
            soma += file.nextInt();
        }

        System.out.println(soma);


    }
}
