public class transform_10 {
    public static void main(String[] args) {
        String binary="101010";
        String octal="52";
        String hex="2A";

        int decimalFromBinary=Integer.parseInt(binary,2);
        int decimalFromOctal=Integer.parseInt(octal,8);
        int decimalFromHex=Integer.parseInt(hex,16);
        System.out.println("二进制转十进制："+decimalFromBinary);
        System.out.println("八进制转十进制："+decimalFromOctal);
        System.out.println("十六进制转十进制："+decimalFromHex);
    }
}
