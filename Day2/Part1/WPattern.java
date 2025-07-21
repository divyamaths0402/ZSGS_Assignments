public class WPattern {
    public static void main(String[] args) {
        int maxRows = 3;  
        int i = 1;

    
        while (i <= maxRows) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i++;
        }

    
        i = maxRows - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
