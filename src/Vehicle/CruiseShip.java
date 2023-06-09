package Vehicle;

import javax.swing.*;
import java.util.Objects;

public class CruiseShip extends MarineVehicle implements IMotorized, ICommercial{

    private double avgFuelConsumption;
    private double avgEngineLifeSpan;
    private String typeOfLicense;

    private ImageIcon image;

    public CruiseShip(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, String countryFlag, double avgFuelConsumption, double avgEngineLifeSpan, ImageIcon image) {
        super();
        this.sailWindDirection=true;
        this.typeOfLicense="Unlimited";
        this.avgFuelConsumption= avgFuelConsumption;
        this.avgEngineLifeSpan= avgEngineLifeSpan;
        this.countryFlag=countryFlag;
        this.image = image;
    }

    @Override
    public void setTypeOfLicense(String typeOfLicense) {
        typeOfLicense=typeOfLicense;
    }

    @Override
    public void setAvgFuelConsumption(double avgFuelConsumption) {

    }

    @Override
    public void setAvgEngineLifeSpan(double avgEngineLifeSpan) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CruiseShip that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.avgFuelConsumption, avgFuelConsumption) == 0 && Double.compare(that.avgEngineLifeSpan, avgEngineLifeSpan) == 0 && Objects.equals(typeOfLicense, that.typeOfLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), avgFuelConsumption, avgEngineLifeSpan, typeOfLicense);
    }

    @Override
    public String toString() {
        return super.toString() +
                "avgFuelConsumption=" + avgFuelConsumption +
                ", avgEngineLifeSpan=" + avgEngineLifeSpan +
                ", typeOfLicense='" + typeOfLicense + '\''  +
                ",Image Jeep" +image +
                '}';
    }
    public ImageIcon getImageIcon() {
        return this.image;
    }

    public ImageIcon getCruiseShipImageIcon() {
        return this.image;
    }

}