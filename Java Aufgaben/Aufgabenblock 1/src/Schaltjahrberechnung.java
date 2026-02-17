import java.util.Scanner;

public class Schaltjahrberechnung {
    private static final int MIN_YEAR = 1583;

    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Jahreszahl: ");
            year = scanner.nextInt();
        }

        if (year < MIN_YEAR) {
            System.out.printf("%d < %d – Schaltjahr kann nicht ermittelt werden%n", year, MIN_YEAR);
            System.exit(1);
        }

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
        } else {
            System.out.println("Das Jahr " + year + " ist kein Schaltjahr.");
        }

        System.exit(0);
    }
}
