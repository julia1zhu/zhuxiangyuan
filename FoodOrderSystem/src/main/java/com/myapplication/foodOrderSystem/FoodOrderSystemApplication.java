package com.myapplication.foodOrderSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
@MapperScan("com.myapplication.foodOrderSystem.dao")
public class FoodOrderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderSystemApplication.class, args);
	}

}
