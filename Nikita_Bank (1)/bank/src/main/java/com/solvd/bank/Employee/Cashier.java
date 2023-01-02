package com.solvd.bank.Employee;

import java.util.Objects;

public class Cashier extends Employee implements IGreet {
    private String tasks;

    public Cashier() {
    }

    public Cashier(String name, int age, int salary, String tasks) {
        super(name, age, salary);
        this.tasks = tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getTasks() {
        return tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cashier cashier = (Cashier) o;
        return Objects.equals(tasks, cashier.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "tasks='" + tasks + '\'' +
                ", salary=" + salary +
                '}';
    }
}
