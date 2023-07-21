import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio_02 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("textos/textos.json");
        printWriter.println("\"Alguma Coisa\"");
        printWriter.close();
    }
}
