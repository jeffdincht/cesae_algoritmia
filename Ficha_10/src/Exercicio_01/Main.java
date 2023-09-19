package Exercicio_01;

public class Main {
    public static void main(String[] args) {
        //na questao de solicitar ao utilizador fazer um switch-case/if para caso digite "diesel" retorna o Exercicio_01.FuelType.DIESEL.
        Car car = new Car("1","1",31, 30, 22, 30, FuelType.DIESEL);
        Car car2 = new Car("2","2",29, 30, 22, 30, FuelType.GPL);
        Car car3 = new Car("3","3",35, 30, 22, 30, FuelType.GASOLINE);

        car.turnOn();
        System.out.println("");
        car2.turnOn();
        System.out.println("");
        car3.turnOn();
        System.out.println("");

        Car winner = car.race(car2);

        if(winner!=null){
            System.out.println("\nWinner: "+ winner.getBrand());
        }else{
            System.out.println("Empate!");
        }

        System.out.println("Consumo: "+car.consume(95));


    }
}