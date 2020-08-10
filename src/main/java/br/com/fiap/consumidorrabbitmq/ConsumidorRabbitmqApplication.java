package br.com.fiap.consumidorrabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class ConsumidorRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumidorRabbitmqApplication.class, args);
	}

}

