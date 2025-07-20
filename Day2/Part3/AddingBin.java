import java.math.BigInteger;
class AddingBin {
    static String addBinary(String a, String b) {
        BigInteger decimal1=new BigInteger(a,2);
        BigInteger decimal2=new BigInteger(b,2);
        BigInteger fin=decimal1.add(decimal2);
        String finalBinary=fin.toString(2);
        return finalBinary;
    }
    public static void main(String []args){
        String result=addBinary("1101","1010");
        System.out.println(result);
    }
    
}

