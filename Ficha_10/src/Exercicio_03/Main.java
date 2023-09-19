package Exercicio_03;

public class Main {
    public static void main(String[] args) {
        String [] food = {"Ração", "Frango", "Peixe"};
        Animal lua = new Animal("Lua", "gato", "Brasil", 8, food);

        lua.showDetails();
        lua.feed("1", 20);
        lua.showDetails();
    }
}
