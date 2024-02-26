import java.util.Scanner;

public class DataTypeSize {
/*
    - Java has no sizeof operator to find the size of primitive data types but all Java primitive
      wrappers except Boolean provide a SIZE constant in bits that could be divided by eight to get
      the size of a data type in bytes.
    - Moreover, since Java 8, all primitive wrapper classes (except Boolean) have a BYTES constant,
    which gives data type's size in bytes. So you can use that also once you have been moved to Java 8.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of byte:" + (Byte.SIZE/8)+" bytes");
        System.out.println("Size of short: "+ (Short.SIZE/8)+" bytes");
        System.out.println("Size of int: "+ (Integer.SIZE/8)+" bytes");
        System.out.println("Size of double: "+ (Double.SIZE/8)+" bytes");
        System.out.println("Size of float: "+ (Float.SIZE/8)+" bytes");
        System.out.println("Size of long: "+ (Long.SIZE/8)+" bytes");
        System.out.println("Size of char: "+ (Character.SIZE/8)+" bytes");
    }
}
