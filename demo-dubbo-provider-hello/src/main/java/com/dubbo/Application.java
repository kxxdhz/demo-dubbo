package com.dubbo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:applicationProvider.xml")
@SpringBootApplication
public class Application{

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Application.class, args);
		System.out.println("按任意键退出");
		System.in.read();
	}

}
