public class PowerOfTwo{
    public static void main(String [] args){
         int n=16;
        while(n>1){
            if(n%2!=0){
            System.out.println(" Not a power of two");
            }
            n=n/2;
        }  
        System.out.println("Power of two");   
    }
}
