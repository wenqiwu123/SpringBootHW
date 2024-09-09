package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseTestRunner implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        // Test Insert
        Customer customer = new Customer();
        customer.setFirstName("Wenqi");
        customer.setLastName("Wu");
        customer.setEmailId("wenqiwu@usc.edu");
        customer.setPhoneNumber("4255169333");
        customer.setCity("Seattle");

        customerRepository.save(customer);

        // Retrieve Data
        System.out.println("Customers in database: " + customerRepository.findAll());
    }
}
