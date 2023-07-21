import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) throws FileNotFoundException {
        //ler arquivo csv
        Scanner readFile = new Scanner(new File("textos/csvtext.csv"));

        System.out.println(readFile.nextLine());
    }
}
