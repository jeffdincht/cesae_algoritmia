package Exercicio_01;

public class Car {
    private String brand, model;
    private int year, potency, engine, liters100km;
    private FuelType fuelType;


    /**
     * Constructor Method to create a new car.
     * @param brand - Exercicio_01.Car's brand
     * @param model - car's model
     * @param year - car's manufacture year
     * @param potency - car's potency
     * @param engine - car's engine capacity
     * @param liters100km - litters per 100KM
     */
    public Car(String brand, String model, int year, int potency, int engine, int liters100km, FuelType fueltype) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.potency = potency;
        this.engine = engine;
        this.liters100km = liters100km;
        this.fuelType = fueltype;
    }

    public String getBrand() {
        return brand;
    }

    /**
     * Method to turn on the car.
     */
    public void turnOn(){
        if(this.year > 30){
            //if the car has more than 30 years
            if(this.fuelType.equals(fuelType.DIESEL)){
                //if the Fuel Type is Diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else{
                //If its another Fuel Type
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }else{
            //if the car has less than 30 years
            if(this.potency >= 250 ){
                //if the car has potency of 250 or more
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMM");
            }else{
                //if the car has less than 250 potency.
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmm");
            }
        }
    }

    /**
     *  Method to see which car would win a race
     * @param opponent - Object Exercicio_01.Car opponent
     * @return - Returns the winning Object Exercicio_01.Car.
     */
    public Car race(Car opponent){
        if(this.potency > opponent.potency){
            //Caso carro 1 tenha mais potencia que carro 2 (carro 1 ganha)
            return this;
        }if(this.potency == opponent.potency){
            //Caso carro 1 e 2 tenham mesma potencia (Empate, ver cilindradas)
            if(this.engine > opponent.engine){
                //Caso carro 1 tenha mais cilindradas que o 2 (carro 1 ganha)
                return this;
            }if(this.engine == opponent.engine){
                //Caso carro 1 e 2 tenham mesma cilindrada (Empate, ver ano)
                if(this.year > opponent.year){
                    //Caso o carro 1 seja mais velho que o 2 (2 ganha)
                    return opponent;
                }if(this.year == opponent.year){
                    //Caso a idade seja a mesma (Empate)
                    return null;
                }else{
                    //Caso carro 2 seja mais velho que o 1 (1 ganha)
                    return this;
                }
            }else{
                //Caso carro 2 tenha mais cilindrada que o 1 (carro 2 ganha)
                return opponent;
            }
        }else{
            //Caso carro 2 tenha mais potencia que carro 1 (Carro 2 ganha)
            return opponent;
        }
    }

    public double consume(double distance){
        return distance/this.liters100km;
    }



}

