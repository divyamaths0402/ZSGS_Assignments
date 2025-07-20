public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int n = word.length();
        int capitalCount = 0;

        
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                capitalCount++;
            }
        }

        
        if (capitalCount == n) return true;

        
        if (capitalCount == 0) return true;

        
        if (capitalCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') return true;

        
        return false;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));     
        System.out.println(detectCapitalUse("Google"));  
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("FlaG"));   
    }
}
