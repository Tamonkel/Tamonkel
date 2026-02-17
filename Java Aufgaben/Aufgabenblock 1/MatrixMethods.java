import java.util.Scanner;

public class MatrixMethods {

    // Methode zur Ausgabe einer Matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println(); // Leerzeile
    }

    // Methode zur Erstellung der Dreiecks-Matrix
    public static int[][] createTriangleMatrix(int n, int m) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    matrix[i][j] = 22;
                } else {
                    matrix[i][j] = 55;
                }
            }
        }

        return matrix;
    }

    //Erstellung der Rahmen-Matrix
    public static int[][] createFrameMatrix(int n, int m) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    matrix[i][j] = 22;
                } else {
                    matrix[i][j] = 55;
                }
            }
        }

        return matrix;
    }

    // main-Methode
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Anzahl Spalten: ");
        int n = keyboard.nextInt();
        System.out.print("Anzahl Zeilen: ");
        int m = keyboard.nextInt();

        int[][] mat1 = createTriangleMatrix(n, m);
        int[][] mat2 = createFrameMatrix(n, m);

        System.out.println("Matrix mat1 (Dreieck):");
        printMatrix(mat1);
        System.out.println("Matrix mat2 (Rahmen):");
        printMatrix(mat2);

        keyboard.close();
    }
}

