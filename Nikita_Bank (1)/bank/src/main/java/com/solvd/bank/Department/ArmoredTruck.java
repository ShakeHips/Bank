package com.solvd.bank.Department;

public class ArmoredTruck extends Vehicle{
    private String schedule;
    private String location;

    public ArmoredTruck(){
    }

    public ArmoredTruck(String assignedDriver, String schedule, String location){
        super(assignedDriver);
        this.schedule = schedule;
        this.location = location;
    }


    public String getSchedule(){
        return schedule;
    }

    public void setSchedule(String schedule){
        this.schedule = schedule;
    }
    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
