public class Exercicio_01 {
    public static void main(String[] args) {

        int num = 0;

        while(num < 300){
            if(num%2==0){
                System.out.println("Pares: "+num);
            }
            num++;
        }
        // com for
        for (int i = 0; i<300; i++){
            if(i%2==0){
                System.out.println("Pares: "+i);
            }
        }
    }

}
