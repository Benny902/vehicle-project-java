package Vehicle;

public class Frigate extends MarineVehicle implements IMotorized{

    private int avgFuelCons=500;
    private int EngineLifeSpan=4;
    public Frigate(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean sailWindDirection, String countryFlag) {
        super(model, distanceTraveled, numOfPassengers, maxSpeed, sailWindDirection, "israel");
        theAvgFuelConsumption(avgFuelCons);
        theAvgEngineLifeSpan(EngineLifeSpan);
    }

    @Override
    public String toString() {
        String flagbool;
        if (this.sailWindDirection=true) { // with
            flagbool="with";
        }
        else // against
            flagbool="against";
        return "Frigate{" +
                ", Model: '" + model + '\'' +
                ", traveled: " + distanceTraveled + " Km" +
                ", Max speed of " + maxSpeed + " Mph" +
                ", can carry max of " + numOfPassengers + " people." +
                " Under " + countryFlag + " flag" +
                ", " + flagbool + " the wind. " +
                "Engine: " + avgFuelCons + "L" +
                ", lifetime of " + EngineLifeSpan + " Years." +
                '}';
    }

    @Override
    public void theAvgFuelConsumption(int avgFuelConsumption) {
        this.avgFuelCons=avgFuelConsumption;
    }

    @Override
    public void theAvgEngineLifeSpan(int avgEngineLifeSpan) {
        this.EngineLifeSpan=avgEngineLifeSpan;
    }
}
