package com.cosin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
public class SpringDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDesignPatternApplication.class, args);
	}

}
