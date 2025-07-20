import java.util.Scanner;

public class DecimalToBinary{
     public static void main(String [] args){
          Scanner input=new Scanner (System.in);
          System.out.println("Enter the decimal number: ");
          int decimal=input.nextInt();
          int number=decimal;
          String binary="";
          while(number>0){
             int remainder=number%2;
             binary=remainder+binary;
             number=number/2;
         }
         System.out.println(binary);
     }

}