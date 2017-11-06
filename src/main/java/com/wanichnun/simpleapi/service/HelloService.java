package com.wanichnun.simpleapi.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloService {
    public Map<String, Object> getHello(String name) {
        String message = "Hello " + name;
        String info = "Your name length is " + name.length();

        Map<String, Object> response = new HashMap<>();
        response.put("greeting", message);
        response.put("info", info);

        return response;
    }
}
