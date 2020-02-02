package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Oh, well, hello, world...");
        System.out.println("Java Primitive Data Types:");
        System.out.println("Byte: one of the most basic units of memory made up of 8 individual bits");
        System.out.println("--- Minimum Value: -128 (2^7), " +
                "Maximum Value: 127 (2^7-1), " +
                "Default Value: 0");
        byte a = 12;
        //a = a + 1; error- 1 is int by default
        a = (byte) (a + 1);
        System.out.println(a);

        System.out.println("Short: A short is twice the size of a byte, i.e. it is made up of 16-bits");
        System.out.println("--- Minimum Value: -32,768 (2^15), " +
                "Maximum Value: 32,767 (2^15-1), " +
                "Default Value: 0");
        short b = 13;
        //b = b + 2; error- 2 is int by default
        b = (short) (b + 2);
        System.out.println(b);

        System.out.println("Int: An integer is four times the size of a byte (i.e. it is made up of 32 bits)");
        System.out.println("--- Minimum Value: -2,147,483,648 (2^31), " +
                "Maximum Value: 2,147,483,647 (2^31 – 1), " +
                "Default Value: 0");
        int userAge = 21;
        System.out.println(userAge);

        System.out.println("Long: A long data type is twice the size of an integer, i.e. it is made up of 64-bits");
        System.out.println("--- Minimum Value: -9,223,372,036,854,775,808 (2^63), " +
                "Maximum Value: 9,223,372,036,854,775,807 (2^63 – 1), " +
                "Default Value: 0");
        System.out.println("Float: any decimal or fractional value is called a ‘float’. In Java, a float is made up of 32-bits IEEE floating points");
        //float pi = 3.14; error
        float pi = 3.14f;
        pi = pi * 2;
        System.out.println(pi);
        float pi2 = 3.14f;
        pi2 = pi2 + 2;
        System.out.println(pi2);
        float pi3 = 3.14f;
        //pi3 = pi3 + 9.8; error - 9.8 is double type by default
        pi3 = (float) (pi3 + 9.8);
        //pi3 = pi3 + 9.8f; also works
        System.out.println(pi3);


        System.out.println("Double: a data type that is twice the size of a float. I.e. it is made up of 64-bit IEEE floating points");
        System.out.println("Char: Char data type refers to a single 16-bit Unicode character.");
        System.out.println("--- This includes alphabets, symbols ($, &, *, #, @, !, etc.), and special figures such as ¢, £, ¥, etc");
        char n = 'N';
        System.out.println(n);

        System.out.println("Boolean: Boolean is the smallest data type in Java, i.e. it is made up of only one bit");
        System.out.println("--- can have only two values – 0 (or False) and 1 (or True)");
        boolean c = false;
        System.out.println(c);
        boolean d = true;
        System.out.println(d);


    }
}
