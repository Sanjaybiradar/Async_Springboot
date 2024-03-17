package com.learning.asynchronous_springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
    @Async
    public CompletableFuture<String> asyncTask(){
        try {
            Thread.sleep(5000);
            System.out.println("Running Async task completed!");
            return CompletableFuture.completedFuture("Async Task Completed");
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("Async Task failed to complete!");
    }
}
