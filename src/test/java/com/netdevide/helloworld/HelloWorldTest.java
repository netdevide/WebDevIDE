package com.netdevide.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Scott on 8/26/13.
 */
public class HelloWorldTest {
    private HelloWorld hw = new HelloWorld();

    private HelloWorld getHelloWorld() {
        return hw;
    }

    @Test
    public void testHelloWorld() {
        getHelloWorld().printHelloWorld();
    }

    @Test
    public void testGetHello() {
        String hello = getHelloWorld().getHello();
        assertEquals("Hello should be 'Hello'", "Hello", hello);
    }

    @Test
    public void testGetWorld() {
        String world = getHelloWorld().getWorld();
        assertEquals("World should be 'World'", "World", world);
    }
}
