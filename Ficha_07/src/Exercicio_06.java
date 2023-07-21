import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File("textos/idades.csv"));
        int idade = 0;
        String nome = "";

        while(readFile.hasNext()){
            String[] itens = readFile.nextLine().split(",");
            for(int i = 0; i<itens.length; i++){
                System.out.println(itens[i]);
                if(i == 1 && Integer.parseInt(itens[1]) > idade){
                    nome = itens[0];
                    idade = Integer.parseInt(itens[1]);
                }
            }
        }

        System.out.println(nome+" - "+idade);
    }
}
