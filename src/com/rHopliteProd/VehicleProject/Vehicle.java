package com.rHopliteProd.VehicleProject;

public class Vehicle {
    private String roamingEnvironment;
    private String engineType;
    private int numberOfDoors;
    private int fuelType;
    private int numberOfWheels;
    private String coveringDistance;
    private int numberOfSeats;

    public Vehicle(String roamingEnvironment, String engineType, int numberOfDoors, int fuelType, int numberOfWheels, String coveringDistance, int numberOfSeats) {
        this.roamingEnvironment = roamingEnvironment;
        this.engineType = engineType;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.numberOfWheels = numberOfWheels;
        this.coveringDistance = coveringDistance;
        this.numberOfSeats = numberOfSeats;
    }

    public String getRoamingEnvironment() {
        return roamingEnvironment;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getFuelType() {
        return fuelType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getCoveringDistance() {
        return coveringDistance;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void steering(){

    }
}
