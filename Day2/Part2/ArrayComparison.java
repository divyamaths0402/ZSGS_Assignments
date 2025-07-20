public class ArrayComparison{
      public static void main(String [] args){
        int []x={'m','n','o','p'};
        int []y={'m','n','o','p'};
        boolean identical=true;
        if(x.length!=y.length){
            identical=false;
        }
        else{
            for(int i=0;i<x.length;i++){
               if(x[i]!=y[i]){
                identical=false;
                // break;
                }
            }
        }
        if(identical){
            System.out.println("These are identical");
        }
        else{
            System.out.println("These are not identical");
        }
      }
}