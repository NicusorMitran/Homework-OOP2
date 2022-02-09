package org.example;

public class Mazda extends Volkswagen{

    public final int tankSize = 60;
    public final String fuelType = "gas";
    public final double factoryFuelConsumption = 4;

    Mazda(int availableFuel, String chassisNumber) {
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
