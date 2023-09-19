package Exercicio_10;

public class Employee {
    private String name, department;
    private double salary;

    /**
     * Constructor Method for creating Employee
     * @param name - Employee's name
     * @param salary - Employee's salary
     * @param department - Which department the employee works
     */
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Method to raise salary
     * @param raise - value to raise
     */
    public void raiseSalary(double raise){

        this.salary+=(this.salary*raise/100);
    }

    /**
     * Method to show details from Employee.
     */
    public void showDetails(){
        System.out.println("\nName: "+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("Salary: "+this.salary);

    }
}
