package com.solvd.bank.Employee;

public abstract class Employee extends Human implements IGreet {
    protected int salary;

    public Employee(){
    }

    public Employee(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }



    public void greet(){
        System.out.println("Hello there!");
    }

}
