package Exercicio_04;

public class Circulo {
    private int radius;

    public Circulo(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea (){
        return 3.14 * this.radius * this.radius;
    }
}
