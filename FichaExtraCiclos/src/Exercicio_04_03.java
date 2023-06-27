public class Exercicio_04_03 {
    public static void main(String[] args) {
        char ast = '*';
        int limite1 = 6;
        int limite2 = 6;

        for (int i = 0; i<6; i++){
            for (int j = 0; j<11; j++){
                if(j < limite1 && j>limite2){
                    System.out.print(ast);
                }else{
                    System.out.print(" ");
                }
            }
            limite1++;
            limite2--;
            System.out.println(" ");
        }
    }
}

