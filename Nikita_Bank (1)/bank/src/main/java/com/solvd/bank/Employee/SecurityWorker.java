package com.solvd.bank.Employee;

import java.util.Objects;

public class SecurityWorker extends Employee implements IGreet {
    private String departmentLocation;

    public SecurityWorker(){
    }

    public SecurityWorker(String name, int age, int salary, String departmentLocation) {
        super(name, age, salary);
        this.departmentLocation = departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation){
        this.departmentLocation = departmentLocation;
    }

    public String getDepartmentLocation(){
        return departmentLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecurityWorker that = (SecurityWorker) o;
        return Objects.equals(departmentLocation, that.departmentLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentLocation);
    }

    @Override
    public String toString() {
        return "SecurityWorker{" +
                "departmentLocation='" + departmentLocation + '\'' +
                '}';
    }
}
