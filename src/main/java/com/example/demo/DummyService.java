package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public String processData(String input) {
        return "Processed: " + input;
    }

    public boolean validateUser(String username) {
        return username != null && !username.isEmpty();
    }

    public void logEvent(String event) {
        System.out.println("Event logged: " + event);
    }
    public String getStatus(){
        return "Application";
    }
    public String getStatus2(){
        return "Application";
    }
}
