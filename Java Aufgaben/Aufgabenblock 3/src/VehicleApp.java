public class VehicleApp {
    public static void main(String[] args) {
        PKW car = new PKW();
        car.setOwner("Max Mustermann");
        car.setVelocity(50);
        car.accelerate(10);
        car.decelerate(5);

        car.print(2); // gibt Informationen aus + 2 Leerzeilen
    }
}
