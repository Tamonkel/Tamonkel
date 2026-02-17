package flugzeug;

import java.time.LocalTime;

public class TransportAircraft extends Airplane {
    private int maxPassengers;
    private int cruiseSpeed;
    private String airline;

    public TransportAircraft(String manufacturer, int maxSpeed, int maxPassengers,
                             int cruiseSpeed, String airline) {
        super(manufacturer, maxSpeed, 1);
        setMaxPassengers(maxPassengers);
        setCruiseSpeed(cruiseSpeed);
        this.airline = airline;
    }

    public int getMaxPassengers() { return maxPassengers; }
    public void setMaxPassengers(int maxPassengers) {
        if (maxPassengers > 0)
            this.maxPassengers = maxPassengers;
    }

    public int getCruiseSpeed() { return cruiseSpeed; }
    public void setCruiseSpeed(int cruiseSpeed) {
        if (cruiseSpeed > 0)
            this.cruiseSpeed = cruiseSpeed;
    }

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    @Override
    public LocalTime calcArrivalTime(LocalTime departure, int distance) {
        return calcArrivalTime(departure, distance, false); // default: cruise speed
    }

    public LocalTime calcArrivalTime(LocalTime departure, int distance, boolean flyingWithMaxSpeed) {
        int speed = flyingWithMaxSpeed ? getMaxSpeed() : getCruiseSpeed();
        double time = (double) distance / speed;
        int minutes = (int) Math.round(time * 60);
        return departure.plusMinutes(minutes);
    }

    @Override
    public String toString() {
        return super.toString() + ", TransportAircraft [maxPassengers=" + maxPassengers +
                ", cruiseSpeed=" + cruiseSpeed + ", airline=" + airline + "]";
    }
}


