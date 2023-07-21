import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File("textos/textos.json"));
        PrintWriter printWriter = new PrintWriter("textos/textos.txt");

        while(readFile.hasNextLine()){
            String linha = readFile.nextLine();
            printWriter.println(linha);
        }

        printWriter.close();
    }
}
