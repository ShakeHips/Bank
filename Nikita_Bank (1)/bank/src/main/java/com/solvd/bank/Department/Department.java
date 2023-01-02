package com.solvd.bank.Department;

public final class Department {
    private final String location;
    private int parking;
    private int employeeCount;

    public Department(String location){
        this.location = location;
    }

    public Department(int parking, int employeeCount, String location){
        this.parking = parking;
        this.employeeCount = employeeCount;
        this.location = location;
    }

    private int getParking(){
        return parking;
    }

    public void setParking(int parking){
        this.parking = parking;
    }

    private int getEmployeeCount(){
        return parking;
    }

    public void setEmployeeCount(int parking){
        this.parking = parking;
    }

    final void getAdress(){
        System.out.println( "This department's adress is " + this.location);
    }

}
