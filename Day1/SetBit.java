public class SetBit{
      public static void main(String [] args){
            int n=10;
            int count=1;
            while((n&1)!=1){
                count++;
                n=n>>1;

            }
            System.out.println("Position "+count);
      }
}