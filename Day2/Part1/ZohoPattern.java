public class ZohoPattern {
    public static void main(String[] args) {
        String str = "ZOHOCORPORATIONS";
        int length = str.length();
        int i = 0;

        do {
            int j = 0;
            do {
                if (i + j < length) {
                    System.out.print(str.charAt(i + j));
                }
                j++;
            } while (j < 4);

            System.out.println();
            i += 4;
        } while (i < length);
    }
}
