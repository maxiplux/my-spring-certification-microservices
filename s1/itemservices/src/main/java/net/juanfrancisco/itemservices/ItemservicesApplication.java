package net.juanfrancisco.itemservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ItemservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemservicesApplication.class, args);
    }

}
