import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        System.out.println("Exercicio_08");

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Valor da nota 1: ");
        nota1 = input.nextInt();

        System.out.println("Valor da nota 2: ");
        nota2 = input.nextInt();

        System.out.println("Valor da nota 3: ");
        nota3 = input.nextInt();

        media = (nota1*0.25) + (nota2*0.35) + (nota3*0.4);

        if(media >=9.5){
            System.out.println("Aprovado, media: "+media);
        }else{
            System.out.println("Reprovado, media: "+media);
        }

    }
}