package Exercicio_07;

public class Book {

    private String title, author, genre, isbn;
    private int pages;

    public Book(String title, String author, String genre, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.pages = pages;
    }

    public void showDetails(){
        System.out.println("Book title: "+this.title + "\nAuthor: " +this.author +"\nGenre: "+this.genre+"\nISBN: "+this.isbn+"\nPages: "+this.pages+"\n");
    }

}
