package model;

public class Employee {
    private String name;
    private String salary;
    private int age;

    public Employee(String name, String salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public String getSalary(){
        return salary;
    }

    public int getAge(){
        return age;
    }
}
