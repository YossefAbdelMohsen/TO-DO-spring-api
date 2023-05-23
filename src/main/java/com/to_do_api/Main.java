package com.to_do_api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
public static void main(String[] args){
    SpringApplication.run(Main.class , args);
    System.out.println("Hello");
}

@GetMapping("/")
    public String greet(){
    return "Hello";
}


}