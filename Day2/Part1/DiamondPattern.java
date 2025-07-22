class DiamondPattern{
    public static void main(String [] args){
         int m=0;
         int y=1;
         int n=5;
         int mid=n/2;
        for(int i=0;i<mid+1;i++){
            for(int x=0;x<(mid+1)-i;x++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
            System.out.print((m+=1)+" ");
            }
            System.out.println();
        }
        for(int i=mid;i>0;i--){
            for(int z=0;z<=y;z++){
                System.out.print(" ");
            }
            y+=1;
            for(int j = 0;j<i;j++){
                System.out.print((m+=1)+" ");
            }
            System.out.println();
        }
    }
    
    
    

}