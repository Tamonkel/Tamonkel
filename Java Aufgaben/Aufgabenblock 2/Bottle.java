public class Bottle {

    private double r, h, f, ro;			// the attributes of a bottle
    // the units used are cm
    public Bottle() {
        r = 0.0;
        h = 0.0;
        f = 0.0;
        ro = 0.0;
    }

    public Bottle(double r, double h, double f, double ro) {
        this.r = r;
        this.h = h;
        this.f = f;
        this.ro = ro;
    }

    public double getFootprint() {
        return Math.PI * r * r;
    }

    public double getVolume() {
        return getFootprint() * h;
    }

    public double getArea() {
        return 2 * (getFootprint() + Math.PI * r * h);
    }

    public double getLiquidVolume() {
        return getFootprint() * f;
    }

    public double getMass() {
        return ro * getVolume();
    }

    public static void main (String[] args) {
        Bottle bl = new Bottle(4.0, 13.0, 2.0, 1.0);
        double v = bl.getVolume();

        System.out.println("Volume of the bottle equals " + v +" cm\u00B3");
    }
}