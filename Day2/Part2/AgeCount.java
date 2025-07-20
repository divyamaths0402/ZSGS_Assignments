import java.util.Arrays;
import java.util.Scanner;

public class AgeCount{
    public static void main(String [] args){
         int []arr=new int[10];
         int less18count=0;
         int betcount=0;
         int great40count=0;
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the Age");
         for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
         
            if(arr[i]<18){
              less18count++;
            }
            else if(arr[i]>18 && arr[i]<40){
             betcount++;
            }
            else{
             great40count++;
            }
         }
         System.out.println("Less 18 count: "+less18count);
         System.out.println("Count between 18-40: "+betcount);
         System.out.println("Count greaterthan 40: "+great40count);
         
    }
}

         
   