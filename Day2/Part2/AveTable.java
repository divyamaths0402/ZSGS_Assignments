import java.util.Scanner;

public class AveTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] rollNo = new int[10];
        int[][] marks = new int[10][3];  
        int[] total = new int[10];
        double[] average = new double[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNo[i] = input.nextInt();

            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
                sum += marks[i][j];
            }

            total[i] = sum;
            average[i] = sum / 3.0;
            System.out.println(); // Blank line for spacing
        }

        // Output table
        System.out.printf("%-10s %-12s %-10s\n", "Roll No", "Total Marks", "Average");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12d %-10.2f\n", rollNo[i], total[i], average[i]);
        }

    
    }
}
