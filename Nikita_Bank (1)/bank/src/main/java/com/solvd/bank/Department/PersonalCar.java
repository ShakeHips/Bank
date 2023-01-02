package com.solvd.bank.Department;

public class PersonalCar extends Vehicle {
    private String parkingPlace;

    public PersonalCar(){
    }

    public PersonalCar(String assignedDriver, String parkingPlace){
        super(assignedDriver);
        this.parkingPlace = parkingPlace;
    }
    public void setParkingPlace(String parkingPlace){
        this.parkingPlace = parkingPlace;
    }

    public String getParkingPlace(){
        return parkingPlace;
    }

}
