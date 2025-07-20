public class FindingExtraChar{
    public static char findingDiff(String s,String t){
        int sumS=0;
        int sumT=0;
        for(char ch:s.toCharArray()){
            sumS+=ch;
        }
         for(char ch:t.toCharArray()){
            sumT+=ch;
        }
        return (char)(sumT-sumS);
    }
    public static void main(String [] args){
        char extra=findingDiff("leetcode","leetcodee");
        System.out.println(extra);
        
    }
}