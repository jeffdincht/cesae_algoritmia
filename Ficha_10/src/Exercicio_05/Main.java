package Exercicio_05;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Pessoa pessoa1 = new Pessoa("J1", "email", 1, 123456);
        Pessoa pessoa2 = new Pessoa("J2", "email2", 2, 567);
        Pessoa pessoa3 = new Pessoa("J3", "email3", 3, 235);

        agenda.addPessoa(pessoa1);
        agenda.addPessoa(pessoa2);
        agenda.addPessoa(pessoa3);

        agenda.mostrarAgenda();

    }
}
