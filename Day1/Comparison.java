public class Comparison {
     public static void main(String [] args){
        int a=10;
        int b=30;
       int sum=a^b;
       switch(sum){
        case 0:
           System.out.println("True");
           break;
        default:
           System.out.println("False");
       }
     }
}