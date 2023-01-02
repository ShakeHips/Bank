package com.solvd.bank.Department;

public abstract class Vehicle {
    private String assignedDriver;

    public Vehicle(){
    }

    public Vehicle(String assignedDriver){
        this.assignedDriver = assignedDriver;
    }

    public String getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(String assignedDriver) {
        this.assignedDriver = assignedDriver;
    }
}
