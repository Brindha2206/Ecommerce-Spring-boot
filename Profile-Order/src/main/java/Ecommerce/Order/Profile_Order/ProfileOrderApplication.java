package Ecommerce.Order.Profile_Order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class ProfileOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileOrderApplication.class, args);
	}

}
