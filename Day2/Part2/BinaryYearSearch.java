import java.util.Scanner;
import java.util.Arrays;

public class BinaryYearSearch {
    public static void main(String[] args) {
        int[] year = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};

        
        Arrays.sort(year);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int inputYear = input.nextInt();

        int ans = binarySearch(year, inputYear);

        if (ans != -1) {
            System.out.println("Record exists " );
        } else {
            System.out.println("Record does not exist");
        }

    
    }

    static int binarySearch(int[] year, int inputYear) {
        int start = 0;
        int end = year.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (inputYear < year[mid]) {
                end = mid - 1;
            } else if (inputYear > year[mid]) {
                start = mid + 1;
            } else {
                return mid; // Found
            }
        }

        return -1; // Not found
    }
}
