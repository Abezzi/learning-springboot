package com.alex.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
record Address(String street, String city, int PostalCode) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 69;
    }

    @Bean
    public Person person() {
        return new Person("Alex", 11, new Address("punta del cerro", "villa rica", 43223));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name,  int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("el arenal, 1 poniente A", "Talca", 323212);
    }

    @Bean(name="address2")
    public Address address2() {
        return new Address("otra calle", "Otra ciudada", 213213);
    }
}
