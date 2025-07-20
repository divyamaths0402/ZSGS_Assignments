import java.util.Scanner;

public class GradeSwitch{
    public static void main(String [] args){
         Scanner userInput = new Scanner(System.in);
         System.out.println("Enter the percentage");
         int percent=userInput.nextInt();
         String gradeCode;
         if(percent>=85 && percent<=100){
            gradeCode="A";
         }
         else if(percent>=70 && percent<85){
            gradeCode="B";
         }
         else if(percent>=50 && percent<=70){
            gradeCode="C";
         }
         else{
            gradeCode="Fail";
         }
         switch(gradeCode){
            case "A":
                  System.out.println("Grade A");
                  break;
            case "B":
                  System.out.println("Grade B");
                  break;
            case "C":
                  System.out.println("Grade C");
                  break;
            default:
                 System.out.println("Fail");
         }
    }
}