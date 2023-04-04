package System;

import Vehicle.Vehicle;
import Vehicle.Jeep;
import Vehicle.Frigate;

public class Main {
    public static void main(String[] args) {
        //Jeep(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, int numOfWheels, boolean roadType, String typeOfLicense, int avgFuelConsumption, int avgEngineLifeSpan)
        Vehicle a = new Jeep("BMW", 800, 2, 320, 4, false, "MINI", 25, 2);
        System.out.println(a.toString());


        //Frigate(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean sailWindDirection, String countryFlag)
        Vehicle b = new Frigate("QWed123",30, 400, 100, true, "israel");
        System.out.println(b.toString());
    }
}