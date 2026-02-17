import java.util.Scanner;

public class MatrixSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Dimensionen
        System.out.print("Anzahl der Spalten (n): ");
        int n = scanner.nextInt();
        System.out.print("Anzahl der Zeilen (m): ");
        int m = scanner.nextInt();

        // Matrizen initialisieren
        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[m][n];

        // mat1 "Dreieck" füllen
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i && j < n; j++) {
                mat1[i][j] = 22;
            }
            for (int j = i + 1; j < n; j++) {
                mat1[i][j] = 55;
            }
        }

        // mat2 "Rahmen" füllen
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    mat2[i][j] = 22;
                } else {
                    mat2[i][j] = 55;
                }
            }
        }

        // Ausgabe beider Matrizen nebeneinander
        System.out.println("\nMatrix mat1 und mat2:");
        for (int i = 0; i < m; i++) {
            // mat1
            for (int j = 0; j < n; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.print("   ");
            // mat2
            for (int j = 0; j < n; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
