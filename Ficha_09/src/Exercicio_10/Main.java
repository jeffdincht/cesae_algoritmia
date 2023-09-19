package Exercicio_10;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jeff", 2000, "Front-End");

        employee.showDetails();
        employee.raiseSalary(10);
        employee.showDetails();
    }

}
