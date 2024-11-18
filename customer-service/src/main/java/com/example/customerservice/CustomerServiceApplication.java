package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.CustomerReposotory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerReposotory customerReposotory){
		return args -> {
			customerReposotory.save(Customer.builder()
					.name("Mohammed").email("med@gmail.com")
					.build());

			customerReposotory.save(Customer.builder()
					.name("kamal").email("kamal@gmail.com")
					.build());

			customerReposotory.save(Customer.builder()
					.name("salim").email("salim@gmail.com")
					.build());

			customerReposotory.findAll().forEach(c->{
				System.out.println("---------------");
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getEmail());
			});
		};
	}

}
