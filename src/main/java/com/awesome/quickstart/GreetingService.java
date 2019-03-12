package com.awesome.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String geeting(String name) {
        return "Hello " + name;

    }
}
