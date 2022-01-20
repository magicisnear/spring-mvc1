package web.model;

public class Car {

    private int maxSpeed;
    private String model;
    private int year;

    public Car() { }

    @Override
    public String toString() {
        return "Car: " +
                "maxSpeed = " + maxSpeed +
                ", model = '" + model + '\'' +
                ", year = " + year
                ;
    }

    public Car(int maxSpeed, String model, int year) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
