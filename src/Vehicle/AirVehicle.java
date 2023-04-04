package Vehicle;

public abstract class AirVehicle extends Vehicle{

    boolean UseOfTheVehicle; // true = military ,  false = civilian

    public AirVehicle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean UseOfTheVehicle) {
        super(model, distanceTraveled, numOfPassengers, maxSpeed);
        this.UseOfTheVehicle = UseOfTheVehicle;
    }
}
