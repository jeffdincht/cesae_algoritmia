package Exercicio_03;

public class Animal {
    private String name, species, origin;
    private double weight;
    private String[] food;
    private Boolean isValid = false;

    public Animal(String name, String species, String origin, double weight, String[] food) {
        this.name = name;
        this.species = species;
        this.origin = origin;
        this.weight = weight;
        this.food = food;
    }


    //ForEach no Java:
    public void feed(String foodName, double foodWeight) {
        for (String element : this.food) {
            if (element.equalsIgnoreCase(foodName)) {
                this.isValid = !isValid;
                break;
            }
        }

        if (isValid) {
            System.out.println(this.name + " ate");
            this.weight += foodWeight/1000;
        } else {
            System.out.println(this.name + " rejected the food");
        }
    }

    public void showDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Species: "+this.species);
        System.out.println("Weight: "+this.weight);
    }
}
