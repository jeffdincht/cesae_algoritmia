import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("textos/textos.json");
        Scanner readFile = new Scanner(file);

        System.out.println(readFile.nextLine());
    }
}
