package com.to_do_api.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CheckServer {
    @Value("${server.check}")
    private String sendString;
    @GetMapping("/")
    public String serverTest(){


        return "${sendString} : sent from the server";
    }

}
