package Vehicle;

public abstract class Vehicle {
    protected String model;
    protected int distanceTraveled ;

    public Vehicle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed) {
        this.model = model;
        this.distanceTraveled = distanceTraveled;
        this.numOfPassengers = numOfPassengers;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected int numOfPassengers;
    protected int maxSpeed;
    protected void move(int distance){
        distanceTraveled=distanceTraveled+distance;
    }

}
