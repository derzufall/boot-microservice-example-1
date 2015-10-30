package de.derzufall.microservice.springbootjsf.example.jsf.backingbeans;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.context.annotation.Scope;




@javax.inject.Named("helloWorldBean") // like Spring's @Component
@Scope(value = "session") // like javax.enterprise.context.SessionScoped
public class HelloWorldBean {
    
    private double r;

    public HelloWorldBean() {
        r = Math.random();
    }

    public String hello() {
        return "Hello " + ++r + " world from Server. Time now: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }
}
