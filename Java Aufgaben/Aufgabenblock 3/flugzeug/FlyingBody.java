package flugzeug;

import java.time.LocalTime;

public abstract class FlyingBody {
    private String manufacturer;
    private int maxSpeed;

    public FlyingBody(String manufacturer, int maxSpeed) {
        this.manufacturer = manufacturer;
        setMaxSpeed(maxSpeed);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0)
            this.maxSpeed = maxSpeed;
    }

    public abstract LocalTime calcArrivalTime(LocalTime departure, int distance);

    @Override
    public String toString() {
        return "FlyingBody [manufacturer=" + manufacturer + ", maxSpeed=" + maxSpeed + "]";
    }
}
