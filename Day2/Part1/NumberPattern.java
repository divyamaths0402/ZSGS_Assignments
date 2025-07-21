public class NumberPattern {
    public static void main(String[] args) {
        int num = 1;
        int maxRows = 3; 
        int i = 1;

        
        while (i <= maxRows) {
            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();
            i++;
        }

        
        i = maxRows - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
