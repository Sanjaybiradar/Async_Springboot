package com.learning.asynchronous_springboot.controller;

import com.learning.asynchronous_springboot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/asyncTask")
    public CompletableFuture<String> triggerAsyncTask() {
        return asyncService.asyncTask();
    }
}
