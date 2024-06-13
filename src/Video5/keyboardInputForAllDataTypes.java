package Video5;

import java.util.Scanner;

public class keyboardInputForAllDataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*======================= boolean ============================*/
        System.out.print("\ninput boolean value : ");
        boolean booleanValue = scan.nextBoolean();
        System.out.println(booleanValue);

        /*======================= int ============================*/
        System.out.print("\ninput int value : ");
        int intValue = scan.nextInt();
        System.out.println(intValue);

        /*======================= byte ============================*/
        System.out.print("\ninput byte value : ");
        byte byteValue = scan.nextByte();
        System.out.println(byteValue);

        /*======================= short ============================*/
        System.out.print("\ninput short value : ");
        short shortValue = scan.nextShort();
        System.out.println(shortValue);

        /*======================= long ============================*/
        System.out.print("\ninput long value : ");
        long longValue = scan.nextLong();
        System.out.println(longValue);

        /*======================= double ============================*/
        System.out.print("\ninput double value : ");
        double doubleValue = scan.nextDouble();
        System.out.println(doubleValue);

        /*======================= float ============================*/
        System.out.print("\ninput float value : ");
        float floatValue = scan.nextFloat();
        System.out.println(floatValue);

        /*======================= char ============================*/
        System.out.print("\ninput char value : ");
        char charValue = scan.next().charAt(0);
        System.out.println(charValue);

        /*======================= string ============================*/
        System.out.print("\ninput string value 1 : ");
        String stringValue1 = scan.next();
        System.out.println(stringValue1);

        System.out.print("\ninput string value 2 : ");
        String stringValue2 = scan.nextLine();
        System.out.println(stringValue2);

    }
}
