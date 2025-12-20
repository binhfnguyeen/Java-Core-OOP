package com.heulwen;

public class StaticBlockExample {
    private static int staticInt;
    private static double staticDouble;
    private static String staticString;

    static {
        System.out.println("Khối tĩnh được thực thi!");
        staticInt = 10;
        staticDouble = 99.99;
        staticString = "Hello World";
    }

    public static int getStaticInt() {
        return staticInt;
    }

    public static double getStaticDouble() {
        return staticDouble;
    }

    public static String getStaticString() {
        return staticString;
    }
}
