public class MinimumThree{
     public static void main(String [] args){
        int a=20;
        int b=30;
        int c=10;
        int min;
        if(a<b){
            if(a<c){
                min=a;
            }
            else{
                min=c;
            }
        }
        else{
            if(b<c){
                min=b;
            }
            else{
                min=c;
            }
        }
        System.out.println("Minimum number is :"+min);
     }
}