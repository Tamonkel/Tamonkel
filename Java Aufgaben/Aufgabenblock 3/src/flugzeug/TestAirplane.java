package flugzeug;

public class TestAirplane {
    public static void testTransportAircraft() {
        TransportAircraft ta = new TransportAircraft("Airbus", 900, 200, 850, "Lufthansa");
        System.out.println(ta.toString());
        System.out.println("Looping möglich? " + ta.getLooping());
    }

    public static void testDoubleDecker() {
        DoubleDecker d1 = new DoubleDecker("Oldtimer", 300, false);
        DoubleDecker d2 = new DoubleDecker("Modern", 350); // cockpit offen

        System.out.println("DoubleDecker 1:");
        System.out.println(d1.toString());

        System.out.println("DoubleDecker 2:");
        System.out.println(d2.toString());
    }

    public static void testAirplane() {
        Airplane[] flugzeuge = new Airplane[4];
        flugzeuge[0] = new TransportAircraft("Boeing", 850, 180, 800, "Delta");
        flugzeuge[1] = new TransportAircraft("Airbus", 900, 220, 870, "Lufthansa");
        flugzeuge[2] = new DoubleDecker("Vintage", 310, false);
        flugzeuge[3] = new DoubleDecker("Neu", 340); // cockpitOpen = true

        for (Airplane a : flugzeuge) {
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {
        testTransportAircraft();
        System.out.println("-----------");
        testDoubleDecker();
        System.out.println("-----------");
        testAirplane();
    }
}

