package Vehicle;

public class Jeep extends LandVehicle implements IMotorized, ICommercial {
    private String typeOfLicense;
    private int avgFuelConsumption;
    private int avgEngineLifeSpan;


    @Override
    public String toString() {
        String ourRoadType;
        if (this.roadType=true) {
            ourRoadType="pavement";
        }
        else
            ourRoadType="dirt";
        return "Jeep{" +
                "typeOfLicense=" + typeOfLicense +
                ", avgFuelConsumption=" + avgFuelConsumption +
                ", avgEngineLifeSpan=" + avgEngineLifeSpan +
                ", numOfWheels=" + numOfWheels +
                ", roadType=" + ourRoadType +
                ", model=" + model +
                ", distanceTraveled=" + distanceTraveled +
                ", numOfPassengers=" + numOfPassengers +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public Jeep(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, int numOfWheels, boolean roadType, String typeOfLicense, int avgFuelConsumption, int avgEngineLifeSpan) {
        // Jeep details that cannot be changed: Land, Motor, 4Wheels, 5PPl, Dirt
        // Jeep details entered by user: model type, average fuel consumption, average speed and average life of the engine.
        super(model, distanceTraveled, 5, maxSpeed, 4, false);  // false = dirt
        theTypeOfLicense("MINI"); // because the license is always MINI (by the exercise 1 rules)
        theAvgFuelConsumption(avgFuelConsumption);
        theAvgEngineLifeSpan(avgEngineLifeSpan);
    }

    @Override
    public void theTypeOfLicense(String typeOfLicense) {
        this.typeOfLicense=typeOfLicense;
    }

    @Override
    public void theAvgFuelConsumption(int avgFuelConsumption) {
        this.avgFuelConsumption=avgFuelConsumption;
    }

    @Override
    public void theAvgEngineLifeSpan(int avgEngineLifeSpan) {
        this.avgEngineLifeSpan=avgEngineLifeSpan;
    }
}
