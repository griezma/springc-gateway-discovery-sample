package griezma.scgateway.helloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApp.class, args);
    }

    @RequestMapping("/hello")
    String hello() {
        return "Hello world";
    }

    @RequestMapping("/hello/{name}")
    String helloName(@PathVariable String name) {
        return "Hello " + name;
    }

}
