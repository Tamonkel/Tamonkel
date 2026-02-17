import java.util.Scanner;
public class InOutApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gebe einen Namen ein: ");
        String Name = scanner.nextLine();


        System.out.print("Gebe einen Wohnort ein: ");
        String Wohnort = scanner.nextLine();

        System.out.print("Gebe dein Alter ein: ");
        int Alter = scanner.nextInt();

        System.out.println("Name: " +Name);
        System.out.println("Wohnort: " +Wohnort);
        System.out.println("Alter: " +Alter);
    }

}
