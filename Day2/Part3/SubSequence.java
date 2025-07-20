public class SubSequence{
    public static boolean checkSequence(String s,String t){
        int i=0;
        int j=0;
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            else{
                j++;
            }
        }
        return i==s.length();
        
    }
    public static void main(String [] args){
        System.out.println(checkSequence("abc","axnmcb"));
        
    }
}