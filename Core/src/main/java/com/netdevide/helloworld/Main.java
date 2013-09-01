package com.netdevide.helloworld;

import com.netdevide.helloworld.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Scott on 8/26/13.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        UsesHelloWorld main = ctx.getBean(UsesHelloWorld.class);
        main.useHelloWorld();
    }
}
