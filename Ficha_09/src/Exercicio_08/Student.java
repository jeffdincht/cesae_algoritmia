package Exercicio_08;

public class Student {
    private String name, course;
    private int age;
    private double average;

    public Student(String name, String course, int age, double average) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.average = average;
    }

    public void situation(){
        if(this.average > 9.5){
            System.out.println(this.name + " Approved");
        }else{
            System.out.println(this.name+" Disapproved");
        }
    }



}
