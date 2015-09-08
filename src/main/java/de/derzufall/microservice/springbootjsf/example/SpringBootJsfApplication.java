package de.derzufall.microservice.springbootjsf.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJsfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJsfApplication.class, args);
    }
    
    
    /*@Configuration
    protected static class IdExposingRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration {
     
        @Override
        protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
           config.exposeIdsFor(AbstractEntity.class); // add all classes with IDs to be exposed here
        }
    }*/
}
