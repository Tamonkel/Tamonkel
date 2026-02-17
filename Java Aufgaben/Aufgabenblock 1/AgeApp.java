import java.util.Scanner;
public class AgeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe dein Alter ein: ");
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Ungueltiges Alter");
        }
        else if (0 <= a && a < 13) {
            System.out.println("Kind");
        }
        else if (13 <= a && a < 18) {
            System.out.println("Teenager");
        }
        else if (a == 18 || a == 19) {
            System.out.println("Teenager und Erwachsener");
        }
        else {
            System.out.println("Erwachsener");
        }

    }

}
