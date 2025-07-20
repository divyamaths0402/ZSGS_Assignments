   import java.util.Scanner;

public class Grade{
    public static void main(String [] args){
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the percentage");
        int percentage=input.nextInt();
        if(percentage>=85 && percentage<=100){
            System.out.println("Grade A");
        }
        else if(percentage>=70 && percentage<=85){
             System.out.println("Grade B");
        }
        else if(percentage>=50 && percentage<=70){
             System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

        
    }
}