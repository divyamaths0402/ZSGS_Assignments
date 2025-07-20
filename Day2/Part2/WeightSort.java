import java.util.Arrays;
import java.util.Scanner;

public class WeightSort{
    public static void main(String [] args){
         int []arr=new int[10];
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the weights");
         for (int i = 0; i < 10; i++) {
            System.out.print("Weight " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
         for(int i=0;i<10;i++){
              int maxIndex=i;
             for(int j=i+1;j<10;j++){
                 if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                 }
             }
             int  temp=arr[i];
             arr[i]=arr[maxIndex];
             arr[maxIndex]=temp;

         }
         System.out.println(Arrays.toString(arr));
         
    }
}
