package Exercicio_07;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Cem anos de Solidão", "Gabriel Garcia Márquez", "Drama", "123871258764", 300);
        Book book2 = new Book("1984", "George Orwell", "Sci-fi", "9127398172397", 350);

        book1.showDetails();
        book2.showDetails();

    }
}
