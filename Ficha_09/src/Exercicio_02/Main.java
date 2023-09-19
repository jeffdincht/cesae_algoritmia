package Exercicio_02;

public class Main {
    public static void main(String[] args) {

        Cao cao1 = new Cao("fido", "yorkshire");
        Cao cao2 = new Cao("james", "golden retriever");
        Cao cao3 = new Cao("fiona","Shiba inu");


        cao1.setBarkSound("Woof");
        cao2.setBarkSound("Ruff");

        System.out.println(cao1.getName() +" sound: "+cao1.getBarkSound());
        System.out.println(cao2.getName() +" sound: "+cao2.getBarkSound());
        System.out.println(cao3.getName() +" sound: "+cao3.getBarkSound());
    }
}
