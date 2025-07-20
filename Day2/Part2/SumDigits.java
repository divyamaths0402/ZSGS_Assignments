import java.util.Scanner;

public class SumDigits{
    static void sum(int x[],int n){
        int singleDigitSum=0;
        int doubleDigitSum=0;
        for(int i=0;i<n;i++){
            if(x[i]<10){
                singleDigitSum+=x[i];
            }
            else{
                doubleDigitSum+=x[i];
            }
        }
        System.out.println("Sum of single digits:"+singleDigitSum);
        System.out.println("Sum of double digitis:"+doubleDigitSum);
        
    }
    public static void main(String [] args){
        //   Scanner input=new scanner(System.in);
        Scanner input = new Scanner(System.in);
          System.out.println("Enter the size of elements");
          int len=input.nextInt();
          int []arr=new int[len];
          System.out.println("Enter the "+len +"elements");
          for(int i=0;i<len;i++ ){
             arr[i]=input.nextInt();
          }
          sum(arr,len);
    }
}