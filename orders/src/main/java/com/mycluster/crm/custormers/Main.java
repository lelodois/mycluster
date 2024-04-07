package com.mycluster.crm.custormers;

import java.util.ArrayList;
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
@RequestMapping("orders")
class Orders {

    private final CustomerSource customerSource;

    public Orders(CustomerSource customerSource) {
        this.customerSource = customerSource;
    }

    @GetMapping
    public List<Order> get() throws Exception {
        List<Order> orders = new ArrayList<>();

        for (Customer customer : customerSource.findAll()) {
            Integer id = new Random().nextInt(1000, 10000);
            orders.add(new Order(id, customer, "Product " + id));
        }
        return orders;
    }
}


record Order(Integer id, Customer customer, String product) {
}


record Customer(String name, Integer id) {
}