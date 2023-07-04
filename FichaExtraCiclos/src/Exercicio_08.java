import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result= 1;

        System.out.println("numero");
        int num = input.nextInt();

        System.out.println("numero");
        int num2 = input.nextInt();

        for(int i= 0; i<num2; i++){
            result = result*num;
        }
        System.out.println(result);
    }
}
