

public class PascalPattern {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;

        do {
            int val = 1;
            int j = 0;

            do {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
                j++;
            } while (j <= i);  

            System.out.println(); 
            i++;  
        } while (i < n);  
    }
}
