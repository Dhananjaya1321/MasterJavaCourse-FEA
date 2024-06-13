package Video3;

public class ConversionAndCasting {
    public static void main(String[] args) {
        int intValue = 10;
        System.out.println("int value : " + intValue);

        System.out.println("50 + 50 = " + intValue + 90);
        System.out.println("50 + 50 = " + (intValue + 90));

        double doubleValue = intValue;
        System.out.println("converted int value for double : " + doubleValue);

        intValue = (int) doubleValue;
        System.out.println("cast double value for int : " + intValue);

        intValue = (byte) doubleValue;
        System.out.println("cast double value for byte and converted int : " + intValue);

        System.out.println("Division 101/2 : " + (101 / 2));//50
        System.out.println("Division 101.0/2 : " + (101.0 / 2));//50.5
        System.out.println("Division 101/2.0 : " + (101 / 2.0));//50.5

        intValue = (int) 70.7;
        System.out.println(intValue);

        String stringValue = "800";
        System.out.println(stringValue + 10);

        intValue = Integer.parseInt(stringValue);
        System.out.println(intValue + 10);

//        stringValue="800gjhjhjb";
//        intValue=Integer.parseInt(stringValue);//runtime error

        char charValue = 'a';
        System.out.println(charValue);

        System.out.println(charValue + 10);

        intValue = charValue;
        System.out.println("int value of char 'a' : "+intValue);

        doubleValue = charValue;
        System.out.println("double value of char 'a' : "+doubleValue);

        stringValue= String.valueOf(charValue);
        System.out.println(stringValue);

        stringValue= String.valueOf(intValue);
        System.out.println(stringValue);
        System.out.println(stringValue+1);//971
    }
}
