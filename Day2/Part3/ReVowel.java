public class ReVowel {
    static String vowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !(
                    chars[left] == 'a' || chars[left] == 'e' || chars[left] == 'i' ||
                    chars[left] == 'o' || chars[left] == 'u' ||
                    chars[left] == 'A' || chars[left] == 'E' || chars[left] == 'I' ||
                    chars[left] == 'O' || chars[left] == 'U')) {
                left++;
            }

            while (left < right && !(
                    chars[right] == 'a' || chars[right] == 'e' || chars[right] == 'i' ||
                    chars[right] == 'o' || chars[right] == 'u' ||
                    chars[right] == 'A' || chars[right] == 'E' || chars[right] == 'I' ||
                    chars[right] == 'O' || chars[right] == 'U')) {
                right--;
            }

            
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars); 
    }

    public static void main(String[] args) {
        String greet = vowels("hello");
        System.out.println(greet);  
    }
}
