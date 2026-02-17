package flugzeug;

import java.time.LocalTime;

public class Airplane extends FlyingBody implements Landable {
    public static final int DEFAULT_MAX_SPEED = 100;
    public static final int DEFAULT_WINGS_COUNT = 1;

    private int wingsCount;
    private int requiredLength;
    private int requiredWidth;

    public Airplane(String manufacturer, int maxSpeed, int wingsCount) {
        super(manufacturer, maxSpeed);
        setWingsCount(wingsCount);
        this.requiredLength = Runway.DEFAULT_LENGTH;
        this.requiredWidth = Runway.DEFAULT_WIDTH;
    }

    public int getWingsCount() { return wingsCount; }
    public void setWingsCount(int wingsCount) {
        if (wingsCount > 0) this.wingsCount = wingsCount;
    }

    public int getRequiredLength() { return requiredLength; }
    public void setRequiredLength(int requiredLength) {
        if (requiredLength > 0) this.requiredLength = requiredLength;
    }

    public int getRequiredWidth() { return requiredWidth; }
    public void setRequiredWidth(int requiredWidth) {
        if (requiredWidth > 0) this.requiredWidth = requiredWidth;
    }

    @Override
    public boolean landingCheck(Runway r) {
        return r.getLength() >= requiredLength && r.getWidth() >= requiredWidth;
    }

    public boolean getLooping() { return false; }

    @Override
    public LocalTime calcArrivalTime(LocalTime departure, int distance) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + ", Airplane [wingsCount=" + wingsCount +
                ", requiredLength=" + requiredLength +
                ", requiredWidth=" + requiredWidth + "]";
    }
}
