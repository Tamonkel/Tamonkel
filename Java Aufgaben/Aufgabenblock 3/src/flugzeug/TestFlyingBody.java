package flugzeug;

import java.time.LocalTime;

public class TestFlyingBody {

    public static void testTransportAircraft() {
        TransportAircraft ta = new TransportAircraft("Airbus", 900, 200, 850, "Lufthansa");

        System.out.println("=== TransportAircraft ===");
        System.out.println(ta);
        System.out.println("Ankunft (Reisegeschwindigkeit): " +
                ta.calcArrivalTime(LocalTime.of(10, 0), 850));
        System.out.println("Ankunft (Max-Geschwindigkeit): " +
                ta.calcArrivalTime(LocalTime.of(10, 0), 850, true));
    }

    public static void testDoubleDecker() {
        DoubleDecker dd = new DoubleDecker("Fokker", 340, true);

        System.out.println("\n=== DoubleDecker ===");
        System.out.println(dd);
        System.out.println("Looping möglich? " + dd.getLooping());
        System.out.println("Ankunft: " +
                dd.calcArrivalTime(LocalTime.of(9, 30), 340));
    }

    public static void testRunway() {
        Runway r1 = new Runway(); // Standard
        Runway r2 = new Runway(300, 80); // mit Werten
        Runway r3 = new Runway(r2); // Kopie

        System.out.println("\n=== Runways ===");
        System.out.println("Standard Runway: " + r1);
        System.out.println("Custom Runway: " + r2);
        System.out.println("Copied Runway: " + r3);

        r1.setLength(150);
        r1.setWidth(60);
        System.out.println("Modified Runway: " + r1);
    }

    public static void testLandingCheck() {
        Airplane plane = new Airplane("Cessna", 300, 1);
        plane.setRequiredLength(120);
        plane.setRequiredWidth(55);

        Runway runway1 = new Runway(150, 60);  // ausreichend
        Runway runway2 = new Runway(100, 40);  // zu klein

        System.out.println("\n=== LandingCheck ===");
        System.out.println("Runway 1: " + runway1);
        System.out.println("Landing OK? " + plane.landingCheck(runway1));

        System.out.println("Runway 2: " + runway2);
        System.out.println("Landing OK? " + plane.landingCheck(runway2));
    }

    public static void main(String[] args) {
        testTransportAircraft();
        testDoubleDecker();
        testRunway();
        testLandingCheck();
    }
}
