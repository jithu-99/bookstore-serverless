package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author Jithendra Chikkanna
 *
 * Extends SpringBootServletInitializer to facilitate serverless java container
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /**
     * Application main entry point.
     *
     * @param args Command line arguments.
     */
    public static void main(final String... args) {

        SpringApplication.run(Application.class, args);

    }

}
