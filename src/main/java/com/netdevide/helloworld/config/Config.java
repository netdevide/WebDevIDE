package com.netdevide.helloworld.config;

import com.netdevide.helloworld.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Scott on 8/31/13.
 */
@Configuration
@ComponentScan(basePackages = "com.netdevide.*")
public class Config {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
