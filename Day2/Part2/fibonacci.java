
public class fibonacci{
    public static void main(String [] args){
         int [] fibonacciNo=new int[30];
         fibonacciNo[0]=0;
         fibonacciNo[1]=1;
         for(int i=2;i<30;i++){
            fibonacciNo[i]=fibonacciNo[i-1]+fibonacciNo[i-2];
         }
         for(int i=0;i<30;i++){
            System.out.println(fibonacciNo[i]+" ");
         }

    }
}