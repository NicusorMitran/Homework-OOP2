package org.example;

public abstract class Car implements Vehicles{

    public static final  int maximumPossibleGears = 6;
    boolean vehicleIsStarted;
    double consumption = 0;
    int tireSize;
    String chassisNumber;
    double fuelUsed;
    private  int currentGear = 0;
    private  double availableFuel;

    void setAvailableFuel(double availableFuel){
        this.availableFuel = availableFuel;
    }

    public void shiftGear(int gear)
    {
        if((gear > 6) || (gear < 0))
            System.out.println("Invalid gear");
        else
            currentGear = gear;
    }

    double getAvailableFuel(){
        return availableFuel;
    }

    public void start(){
        System.out.println("Vehicle has started");
        this.vehicleIsStarted = true;
        fuelUsed = 0;
    }

    public void stop(){
        System.out.println("Vehicle has stoped");
        this.vehicleIsStarted = false;
    }

    public void drive(double distance)
    {
        if(vehicleIsStarted){
            System.out.println("Gear " + currentGear);
            consumption = ((double) (maximumPossibleGears - currentGear) / 10) * getFuelConsumption();
            fuelUsed = (distance * (getFuelConsumption() + consumption)) / 100;
            availableFuel = availableFuel - fuelUsed;
            System.out.println("We drove " + distance + "km");
            System.out.println("Fuel used this trip= " + fuelUsed);
        }
        else
            System.out.println("The car has not started");
    }

    public double getAvarageFuelConsumption(){
        return getFuelConsumption() + consumption;
    }
}
