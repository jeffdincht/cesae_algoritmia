package Exercicio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("jeff", 34, 1.77);
        Pessoa pessoa2 = new Pessoa("Fulano", 36, 1.50);

        System.out.println("Detalhes pessoa 1:");

        System.out.println(pessoa1.getName());
        System.out.println(pessoa1.getAge());
        System.out.println(pessoa1.getHeight());

        System.out.println("Detalhes pessoa 2:");

        System.out.println(pessoa2.getName());
        System.out.println(pessoa2.getAge());
        System.out.println(pessoa2.getHeight());
    }
}