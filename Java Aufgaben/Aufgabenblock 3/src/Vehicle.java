public class Vehicle {
    private String owner;
    private int actV; // aktuelle Geschwindigkeit (actV ≥ 0)

    public void accelerate(int dV) {
        if (dV >= 0) {
            actV += dV;
        }
    }

    public void decelerate(int dV) {
        if (dV >= 0) {
            actV -= dV;
        }
    }

    public void setVelocity(int v) {
        if (v >= 0) {
            actV = v;
        }
    }

    public int getVelocity() {
        return actV;
    }

    public void setOwner(String o) {
        owner = o;
    }

    public String getOwner() {
        return owner;
    }

    public void print() {
        System.out.println("Owner: " + owner);
        System.out.println("Current Velocity: " + actV);
    }
}
