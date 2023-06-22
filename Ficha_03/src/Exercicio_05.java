public class Exercicio_05 {
    public static void main(String[] args) {

        int num = 1, fim =100, soma = 0;

        while(num<=fim){
            System.out.println("Intervalo: "+num);
            soma = soma +num;
            num++;
            System.out.println("Soma dos valores: "+soma);
        }
    }
}