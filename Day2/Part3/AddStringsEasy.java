public class AddStringsEasy {
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;  
        int j = num2.length() - 1;  
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result = (sum % 10) + result; 
            carry = sum / 10;

            i--;
            j--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));  
        System.out.println(addStrings("456", "77"));  
        System.out.println(addStrings("0", "0"));     
    }
}
