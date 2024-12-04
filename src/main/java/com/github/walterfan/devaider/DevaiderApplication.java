package com.github.walterfan.devaider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;


@SpringBootApplication
public class DevaiderApplication {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(Files.newInputStream(Paths.get(".env")));

        props.forEach((key, value) -> System.setProperty(key.toString(), value.toString()));

        SpringApplication.run(DevaiderApplication.class, args);
    }

}
