package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Car Golf7 =new Golf(32, "WVWZZZAUZJW263648");
        Golf7.changeTireSize(18);
        Golf7.start();
        Golf7.shiftGear(1);
        Golf7.drive(100);
        System.out.println("Actual fuel consumption= " + Golf7.getAvarageFuelConsumption());
        Golf7.shiftGear(2);
        Golf7.drive(100);
        System.out.println("Available fuel= " + Golf7.getAvailableFuel());
        System.out.println("Factory fuel consumption= " + Golf7.getFuelConsumption());
        System.out.println("Actual fuel consumption= " + Golf7.getAvarageFuelConsumption());
        Golf7.stop();

        System.out.println();
        Vehicles Mazda3 =new Mazda(50, "3MZBN62660M322811");
        Mazda3.changeTireSize(19);
        Mazda3.start();
        Mazda3.shiftGear(1);
        Mazda3.drive(200);
        System.out.println("Factory fuel consumption= " + Mazda3.getFuelConsumption());
        Mazda3.stop();
    }
}
