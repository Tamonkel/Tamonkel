public class LogicOpsBitOps {
    public static void main(String[] args) {
        boolean resultBool;
        boolean a = false;
        boolean b = true;

        // 1. Welchen Wert enthaelt resultBool nach dieser Anweisung?
        resultBool = a && b;
        System.out.println("Aufgabe 1: " + resultBool); // false

        // 2. Welchen Wert enthaelt resultBool nach dieser Anweisung?
        resultBool = a || b;
        System.out.println("Aufgabe 2: " + resultBool); // true

        int resultInt;
        int x = 2000;
        int y = 208;

        // 3. Welchen Wert enthaelt resultInt nach dieser Anweisung?
        resultInt = x & y;
        System.out.println("Aufgabe 3: " + resultInt);

        // 4. Welchen Wert enthaelt resultInt nach dieser Anweisung?
        resultInt = x | y;
        System.out.println("Aufgabe 4: " + resultInt);

    }// end main()

}// end class
