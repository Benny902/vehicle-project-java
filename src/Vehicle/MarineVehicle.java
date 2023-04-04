package Vehicle;

public abstract class MarineVehicle extends Vehicle{


    protected boolean sailWindDirection; //true=with . false=against
    protected String countryFlag;

    public boolean isSailWindDirection() {
        return sailWindDirection;
    }

    public void setSailWindDirection(boolean sailWindDirection) {
        this.sailWindDirection = sailWindDirection;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public MarineVehicle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean sailWindDirection, String countryFlag) {
        super(model, distanceTraveled, numOfPassengers, maxSpeed);
        this.sailWindDirection=sailWindDirection;
        this.countryFlag=countryFlag;
    }
}
