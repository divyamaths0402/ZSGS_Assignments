import java.util.Scanner;

public class Matrix{

    // getting input 
    public static void inputMatrix(int[][] A, int m, int n, Scanner sc) {
        System.out.println("Enter " + (m * n) + " elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    public static void displayMatrix(int[][] A, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to calculate total sum
    public static int totalSum(int[][] A, int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += A[i][j];
            }
        }
        return sum;
    }

    // Method to display row-wise sum
    public static void rowWiseSum(int[][] A, int m, int n) {
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += A[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
    }

    // Method to display column-wise sum
    public static void columnWiseSum(int[][] A, int m, int n) {
        System.out.println("Column-wise Sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += A[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }

    // Method to transpose and display
    public static void transposeMatrix(int[][] A, int m, int n) {
        System.out.println("Transpose Matrix (" + n + " x " + m + "):");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter number of rows (m): ");
        m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        n = sc.nextInt();

        int[][] A = new int[m][n];
        int choice;

        do {
            System.out.println("\n---- Menu ----");
            System.out.println("1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Sum of All Elements");
            System.out.println("4. Row-wise Sum");
            System.out.println("5. Column-wise Sum");
            System.out.println("6. Transpose Matrix");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputMatrix(A, m, n, sc);
                    break;
                case 2:
                    displayMatrix(A, m, n);
                    break;
                case 3:
                    System.out.println("Total Sum: " + totalSum(A, m, n));
                    break;
                case 4:
                    rowWiseSum(A, m, n);
                    break;
                case 5:
                    columnWiseSum(A, m, n);
                    break;
                case 6:
                    transposeMatrix(A, m, n);
                    break;
                case 0:
                    System.out.println("Exiting Program.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        
    }
}
