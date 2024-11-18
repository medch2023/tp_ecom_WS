package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repositiry.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Printer")
                    .price(2000)
                    .quantity(20)
                    .build());

            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Phone")
                    .price(5600)
                    .quantity(12)
                    .build());

            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Oridinateur")
                    .price(8900)
                    .quantity(8)
                    .build());

            productRepository.findAll().forEach(product -> {
                System.out.println(product.toString());
            });
        };
    }

}
