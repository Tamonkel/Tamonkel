package flugzeug;

import java.time.LocalTime;

public final class DoubleDecker extends Airplane {
    public static final int LOOPING_SPEED = 320;
    private boolean cockpitClosed;

    public DoubleDecker(String manufacturer, int maxSpeed, boolean cockpitClosed) {
        super(manufacturer, maxSpeed, 2);
        this.cockpitClosed = cockpitClosed;
    }

    public DoubleDecker(String manufacturer, int maxSpeed) {
        this(manufacturer, maxSpeed, false);
    }

    public boolean isCockpitClosed() {
        return cockpitClosed;
    }

    public void setCockpitClosed(boolean cockpitClosed) {
        this.cockpitClosed = cockpitClosed;
    }

    @Override
    public boolean getLooping() {
        return isCockpitClosed() && getMaxSpeed() >= LOOPING_SPEED;
    }

    @Override
    public LocalTime calcArrivalTime(LocalTime departure, int distance) {
        double time = (double) distance / getMaxSpeed();
        int minutes = (int) Math.round(time * 60);
        return departure.plusMinutes(minutes);
    }

    @Override
    public String toString() {
        return super.toString() + ", DoubleDecker [cockpitClosed=" + cockpitClosed + "]";
    }
}

