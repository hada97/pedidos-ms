package br.com.alurafood.pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;


@SpringBootApplication
//@EnableEurekaClient
public class PedidosApplication {

	@Value("${server.port}")
	public static int serverPort;

	public static void main(String[] args) {
		
		SpringApplication.run(PedidosApplication.class, args);
		System.out.println("------------------------");
		System.out.println("---Executando PEDIDOS---");
		System.out.println("------------------------");
		System.out.println("Tomcat is running on port: " + serverPort);

	}

}
