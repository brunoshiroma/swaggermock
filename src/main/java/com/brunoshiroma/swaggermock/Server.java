package com.brunoshiroma.swaggermock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server {

    public static void main(String args[]){
        final var app = new SpringApplication(Server.class);
        app.run();
    }

}
