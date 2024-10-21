public class Main{
    public static void main(String[] args) {
        String hexNumber = "AB8C";
        int decimalValue = hexToDecimal(hexNumber);
        System.out.println("Hexadecimal number " + hexNumber + " converted to decimal is: " + decimalValue);
    }
    public static int hexToDecimal(String hexNumber) {
        int decimalValue = 0;
        int power = 0;
        for (int i = hexNumber.length() - 1; i >= 0; i--) {
            char hexChar = hexNumber.charAt(i);
            int hexValue;
            if (Character.isDigit(hexChar)) {
                hexValue = hexChar - '0';
            } else {
                hexValue = Character.toUpperCase(hexChar) - 'A' + 10;
            }
            decimalValue += hexValue * Math.pow(16, power);
            power++;
        }
        return decimalValue;
    }
}
