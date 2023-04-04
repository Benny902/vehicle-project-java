package Vehicle;

public abstract class LandVehicle extends Vehicle {

    protected int numOfWheels;
    protected boolean roadType; // true = pavement . false=dirt

    public LandVehicle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, int numOfWheels, boolean roadType) {
        super(model, distanceTraveled, numOfPassengers, maxSpeed);
        this.numOfWheels=numOfWheels;
        this.roadType=roadType;
    }
}
