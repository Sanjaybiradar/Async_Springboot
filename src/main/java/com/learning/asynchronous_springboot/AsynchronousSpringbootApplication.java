package com.learning.asynchronous_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;


/*Asynchronous processing is helpful when we want to offload time-consuming tasks
 to separate threads, improving the overall responsiveness of our application.*/
@SpringBootApplication
@EnableAsync
public class AsynchronousSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynchronousSpringbootApplication.class, args);
	}
	@Bean
	public Executor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(1);
		executor.setMaxPoolSize(1);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("Async-POC-test");
		executor.initialize();
		return executor;
	}

}
