package com.awesome.quickstart;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@ApplicationScoped
public class GreetingService {

    public CompletionStage<String> geeting(String name) {
        return CompletableFuture.supplyAsync(() -> "Hello " + name);

    }
}
