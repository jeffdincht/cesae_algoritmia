import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File("textos/textos.json"));

        while(readFile.hasNextLine()){
            System.out.println(readFile.nextLine());
        }
    }
}
