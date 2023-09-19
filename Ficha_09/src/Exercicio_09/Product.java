package Exercicio_09;

public class Product {
    private String name;
    private double price;
    private int quantity = 0;

    /**
     * Constructor method, to set values when creating the product in a new class.
     * @param name name of the Product
     * @param price price of the Product
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void buy(int quantity) {
        this.quantity = this.quantity + quantity;
        System.out.println("Bought:"+quantity+"\nIn Stock: " + this.quantity);
    }

    public void sell(int quantity) {
        int newQuantity = this.quantity - quantity;

        if (newQuantity > 0) {
            setQuantity(newQuantity);
            System.out.println("Sold:"+quantity+"\nIn Stock: " + this.quantity);
        }else{
            System.out.println("Tried to sell: "+quantity+"\nBut we have only: "+this.quantity+".\nSorry, out of Stock!");
        }
    }

}
