public class EvenNumbers{
    // int sum=0;
    public static int  even(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                continue;
            }
            sum+=i;
        }
        return sum;
    }
    public static void main(String [] args){
        int n=10;
        int result=even(n);
        System.out.println(result);

         
    }
}