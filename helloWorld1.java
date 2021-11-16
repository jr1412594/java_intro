public class helloWorld1
{

    // static String randomString = "String to print";
    // static String secondRandomString = "Will this print too";

    // static final double PINUM = 3.141529;
    public static void main(String[] args)
    {
        // System.out.println(PINUM);
        // System.out.println(secondRandomString);
        // System.out.println(PINUM);
        // int integerOne = 22;

        // int integerTwo = integerOne + 1;
        // System.out.println(integerOne);
        // System.out.println(integerTwo);
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 210000000;
        long bigLong = 9220000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.1415291561516;

        // System.out.println(Float.MAX_VALUE);
        // System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 67; //character code number (starts are 65)
        char anotherChar = 'A';
        char escapeChar = '\n'; // lots of these.

        String randomString = "what the eff is this?";
        String anotherString = "Stuff";
        
        String andAnotherString = randomString + anotherString;

        //how to convert a string
                    //Must start with uppercase type followed by function .toString()
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigByte);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigByte);
        String floatString = Float.toString(bigByte);
        String doubleString = Double.toString(bigByte);
        String booleanString = Boolean.toString(trueOrFalse);

        double aDoubleValue = 3.14546566464;
        int doubleToInt = (int) aDoubleValue;
            //To change to other primitive types
            // (byte) (short) (long) (double) (float)

        int stringToInt = Integer.parseInt(intString);
        // parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean
        // System.out.println(randomChar);
        // System.out.println(anotherChar);
        // System.out.println(byteString);
        System.out.println(stringToInt);
    }
}