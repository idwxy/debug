package com.idwxy.debug.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String sayHello(String name) {
        return "Hello," + name;
    }
}
