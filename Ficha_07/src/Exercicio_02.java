import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio_02 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("textos/textos.json");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("oi");

        printWriter.close();
    }
}
