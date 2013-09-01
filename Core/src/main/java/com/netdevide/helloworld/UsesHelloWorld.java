package com.netdevide.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Scott on 8/26/13.
 */
@Service
public class UsesHelloWorld {
    @Autowired
    private HelloWorld hw;

    public void useHelloWorld() {
        hw.printHelloWorld();
    }
}
