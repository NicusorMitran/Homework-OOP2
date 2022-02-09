package org.example;

public class Golf extends Volkswagen{

    public final int tankSize = 50;
    public final String fuelType = "diesel";
    public final double factoryFuelConsumption = 6;

    Golf(int availableFuel, String chassisNumber) {
        setAvailableFuel(availableFuel);
        this.chassisNumber = chassisNumber;
    }

    public double getFuelConsumption(){
        return factoryFuelConsumption;
    }
    public void changeTireSize(int size){
        this.tireSize = size;
    }
}
