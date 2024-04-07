package com.mycluster.crm.custormers;

import java.util.List;
import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}

@RestController
@RequestMapping("customers")
class Customers {

    @GetMapping
    public List<Customer> get() {
        return List.of(
                new Customer("Further", randomId()),
                new Customer("Fly", randomId()),
                new Customer("Show", randomId()),
                new Customer("Marcus", randomId()),
                new Customer("Celsius", randomId())
        );
    }

    private static int randomId() {
        return new Random().nextInt(1000, 10000);
    }
}

record Customer(String name, Integer id) {

}