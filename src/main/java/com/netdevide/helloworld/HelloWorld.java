package com.netdevide.helloworld;

/**
 * Created by Scott on 8/26/13.
 */
public class HelloWorld {
    private static String HELLO = "Hello";
    private static String WORLD = "World";

    public void printHelloWorld() {
        System.out.println(getHello() + " " + getWorld());
    }

    public String getWorld() {
        return WORLD;
    }

    public String getHello() {
        return HELLO;
    }
}
